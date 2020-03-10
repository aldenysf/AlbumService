package model;

import javax.xml.crypto.Data;
import java.text.DateFormat;
import java.util.Date;



public class Album {
    private int  id;
    private String name;
    private String autor;
    private String publicationDate;

    public Album() {
    }

    public Album(int id, String name, String autor, String publicationDate) {
        this.id = id;
        this.name = name;
        this.autor = autor;
        this.publicationDate = publicationDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(String publicationDate) {
        this.publicationDate = publicationDate;
    }
}

