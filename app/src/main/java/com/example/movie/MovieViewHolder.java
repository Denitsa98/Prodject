package com.example.movie;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

public class MovieViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener
{
    private ImageView image;
    private TextView name;
    private TextView genre;
    private TextView year;
    ItemClickListener itemClickListener;

    public MovieViewHolder(@NonNull View itemView) {
        super(itemView);
        image = itemView.findViewById(R.id.imageView);
        name = itemView.findViewById(R.id.textName);
        genre = itemView.findViewById(R.id.textGenre);
        year = itemView.findViewById(R.id.textYear);

        itemView.setOnClickListener(this);
    }

    public void setImage(String url)
    {
        Picasso.get().load(url).into(image);
    }

    public void setName(String name)
    {
        this.name.setText(name);
    }

    public void setGenre(String genre)
    {
        this.genre.setText(genre);
    }

    public void setYear(String year)
    {
        this.year.setText(year);
    }

    @Override
    public void onClick(View v) {
        this.itemClickListener.onItemClickListener(v,getLayoutPosition());
    }

    public void setItemClickListener(ItemClickListener ic)
    {
        this.itemClickListener=ic;
    }

}