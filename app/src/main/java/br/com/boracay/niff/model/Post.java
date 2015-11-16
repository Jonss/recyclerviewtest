package br.com.boracay.niff.model;

public class Post {

    private int idImage;
    private String title;

    public Post(int idImage, String title) {
        this.idImage = idImage;
        this.title = title;
    }

    public int getIdImage() {
        return idImage;
    }

    public String getTitle() {
        return title;
    }



}
