package models;

import java.util.ArrayList;

public class CD {
    private String title;
    private String artist;
    private static ArrayList<CD> instances = new ArrayList<>();

    public CD(String title, String artist){
        this.title = title;
        this.artist = artist;
        instances.add(this);
    }

    public String getTitle() {
        return this.title;
    }
    public static ArrayList<CD> getInstances(){
        return instances;
    }

    public String getArtist() {
        return this.artist;
    }

}
