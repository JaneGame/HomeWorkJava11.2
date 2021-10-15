package ru.netology;


public class Film {
    private int id;
    private String urlImage;
    private String name;
    private String genre;

    public Film(int id, String urlImage, String name, String genre) {
        this.id = id;
        this.urlImage = urlImage;
        this.name = name;
        this.genre = genre;
    }

    public int getId() {
        return id;
    }

    public String getUrlImage() {
        return urlImage;
    }

    public String getName() {
        return name;
    }

    public String getGenre() {
        return genre;
    }



}
