package com.example.movie;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MovieAdapter extends RecyclerView.Adapter<MovieViewHolder> implements Filterable
{
    private Context c;
    private ArrayList<Movie> movies;
    private ArrayList<Movie> moviesFull;


    public MovieAdapter( Context c,ArrayList<Movie> movies)
    {
        this.c=c;
        this.movies = movies;
        moviesFull = new ArrayList<>(movies);
    }

    @NonNull
    @Override
    public MovieViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());

        View movieView = inflater.inflate(R.layout.row_layout, parent, false);

        return new MovieViewHolder(movieView);
    }

    @Override
    public void onBindViewHolder(@NonNull MovieViewHolder holder, int position)
    {
        final Movie movie = movies.get(position);

        holder.setName(movie.getName());
        holder.setGenre(movie.getGenre());
        holder.setYear(movie.getYear());
        holder.setImage(movie.getImageUrl());

        holder.setItemClickListener(new ItemClickListener() {
            @Override
            public void onItemClickListener(View v, int position) {

                String gTitle=movies.get(position).getName();
                String gGenre=movies.get(position).getGenre();
                String gYear=movies.get(position).getYear();
                String gActor=movies.get(position).getActor();
                String gResume=movies.get(position).getResume();
                String gImage=movies.get(position).getImageUrl();

                Intent intent=new Intent(c, activity2.class);
                intent.putExtra("iTitle", gTitle);
                intent.putExtra("iGenre", gGenre);
                intent.putExtra("iYear", gYear);
                intent.putExtra("iActor", gActor);
                intent.putExtra("iResume", gResume);
                intent.putExtra("iImage", gImage);

                c.startActivity(intent);

            }
        });
    }

    @Override
    public int getItemCount()
    {
        return movies.size();
    }

    public void addMovie(Movie movie)
    {
        movies.add(0, movie);
        //notifyItemChanged(0);
        notifyItemInserted (0);
    }

    @Override
    public Filter getFilter() {
        return new Filter() {
            @Override
            protected FilterResults performFiltering(CharSequence charSequence) {
                List<Movie> filteredList=new ArrayList<>();
                String charString = charSequence.toString();
                if (charString.isEmpty())
                {
                     filteredList.addAll(moviesFull);
                } else {
                    String filterPattern=charString.toLowerCase().trim();

                    for (Movie row : moviesFull) {

                        // name match condition. this might differ depending on your requirement
                        // here we are looking for name or phone number match
                        if (row.getName().toLowerCase().contains(filterPattern) || row.getGenre().toLowerCase().contains(filterPattern) || row.getYear().contains(charSequence) || row.getActor().toLowerCase().contains(filterPattern)) {
                            filteredList.add(row);
                        }
                    }

                }

                FilterResults filterResults = new FilterResults();
                filterResults.values = filteredList;

                return filterResults;
            }

            @Override
            protected void publishResults(CharSequence charSequence, FilterResults filterResults) {
                movies.clear();
                movies=(ArrayList<Movie>) filterResults.values;
                // refresh the list with filtered data
                notifyDataSetChanged();
            }
        };
    }
}
