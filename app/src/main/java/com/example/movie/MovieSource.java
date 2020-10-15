package com.example.movie;

import java.util.ArrayList;

public class MovieSource
{
    ArrayList<Movie> movies;

    public MovieSource()
    {

        movies = new ArrayList<Movie>();
        Movie m1=new Movie("Sleeping Beauty", "Fantasy","2016" , "Ethan Peck, Natali Hol, Bruce Davison",
                "Sleeping Beauty is an entirely new, dark vision of the classic Brothers Grimm adventure.Thomas Kaiser inherits an ancestral mansion that has been in his family for generations, only to learn that he has also inherited an ancient curse stemming back to the Crusades.", "https://images-na.ssl-images-amazon.com/images/I/91BPIIUBRzL._SL1500_.jpg");
        Movie m2=new Movie("The Dark Knight", "Action", "2008", "Christian Bale, Gary Oldman, Michael Kane",
                "The Dark Knight is not a simplistic tale of good and evil. Batman is good, yes, The Joker is evil, yes. But Batman poses a more complex puzzle than usual: The citizens of Gotham City are in an uproar, calling him a vigilante and blaming him for the deaths of policemen and others.", "https://cdn.ozone.bg/media/catalog/product/cache/1/image/a4e40ebdc3e371adff845072e1c73f37/c/h/d4ad8940476e1e6d83bbdc224a4334df/cherniyat-ritsar---spetsialno-izdanie-v-2-diska-dvd-31.jpg");
        Movie m3=new Movie("Titanic", "Romance", "1997", "Kate Winslet, Leonardo Di Caprio, Billy Zane",
                " Inspired by the 1985 discovery of the Titanic in the North Atlantic, the contemporary storyline involves American treasure-seeker Brock Lovett retrieving artifacts from the submerged ship. Lovett looks for diamonds but finds a drawing of a young woman, nude except for a necklace.", "https://img.auctiva.com/imgdata/1/9/8/3/0/8/8/webimg/890242778_o.jpg");
        Movie m4=new Movie("Monster", "Horror", "2008", "Sarah Living, Yoshi Ando, Jennifer Kim",
                "Two sisters travelling to Japan to do interviews about global warming are caught in the midst of a horrendous earthquake, until they discover that it's something quite different.", "https://www.gstatic.com/tv/thumb/v22vodart/8377083/p8377083_v_v8_ab.jpg");
        Movie m5=new Movie("Maleficient 2", "Fantasy", "2019", "Angelina Jolie, El Fanning, Michelle Pfeiffer",
                "Maleficent and her goddaughter Aurora begin to question the complex family ties that bind them as they are pulled in different directions by impending nuptials, unexpected allies and dark new forces at play.", "https://zamunda-net.com/wp-content/uploads/2019/05/maleficent-mistress-of-evil-2019.jpg");
        Movie m6=new Movie("Salt", "Action", "2010", "Angelina Jolie, Liv Schreiber, Sensor Ejiofor",
                "A CIA agent goes on the run after a defector accuses her of being a Russian spy. Salt goes on the run, using all her skills and years of experience as a covert operative to elude capture, protect her husband.","https://i.pinimg.com/originals/10/be/de/10bedeb8d15d6a82e4cc765c53508326.jpg");
        Movie m7=new Movie("Knives Out", "Mystery", "2019", "Ana de Armas, Daniel Craig, Jamie Lee Curtis",
                "A detective investigates the death of a patriarch of an eccentric, combative family. Acclaimed writer and director Rian Johnson pays tribute to mystery mastermind Agatha Christie in KNIVES OUT, a fun, modern-day murder mystery where everyone is a suspect.", "https://zamunda-net.com/wp-content/uploads/2019/07/knives-out-2019-poster-2.jpg");
        Movie m8=new Movie("Twilight", "Romance", "2008", "Robert Pattinson, Kristen Stewart, Taylor Lautner",
                "Bella Swan moves to Forks and encounters Edward Cullen, a gorgeous boy with a secret.", "https://m.media-amazon.com/images/M/MV5BMTQ2NzUxMTAxN15BMl5BanBnXkFtZTcwMzEyMTIwMg@@._V1_.jpg");
        Movie m9=new Movie("Under the Shadow", "Horror", "2016", "Narges Rashidi, Bobby Naderi, Avin Manshadi",
                "As a mother and daughter struggle to cope with the terrors of the post-revolution, war-torn Tehran of the 1980s, a mysterious evil begins to haunt their home.", "https://images-na.ssl-images-amazon.com/images/I/81roZkJok5L._AC_SL1500_.jpg");
        Movie m10=new Movie("Motherless Brooklyn", "Mystery", "2019", "Edward Norton, Bruce Willis, William Defoe",
                "In 1950s New York, a lonely private detective afflicted with Tourette's Syndrome ventures to solve the murder of his mentor and only friend.", "https://www.gstatic.com/tv/thumb/v22vodart/16618984/p16618984_v_v8_ad.jpg");

        movies.add(m1);
        movies.add(m2);
        movies.add(m3);
        movies.add(m4);
        movies.add(m5);
        movies.add(m6);
        movies.add(m7);
        movies.add(m8);
        movies.add(m9);
        movies.add(m10);
    }

    public ArrayList<Movie> getMovies()
    {
        return movies;
    }
}
