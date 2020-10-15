package com.example.movie;

public class Movie {
    private String name;
    private String gеnre;
    private String year;
    private String actor;
    private String resume;
    private String imageUrl;

    public Movie(String name, String gеnre, String year, String actor, String resume, String imageUrl) {
        this.name = name;
        this.gеnre = gеnre;
        this.year = year;
        this.actor = actor;
        this.resume = resume;
        this.imageUrl = imageUrl;
    }

    public String getName() {
        return name;
    }

    public String getGenre() {
        return gеnre;
    }

    public String getYear() {
        return year;
    }

    public String getActor() {
        return actor;
    }

    public String getResume() {
        return resume;
    }

    public String getImageUrl() {
        return imageUrl;
    }


}
