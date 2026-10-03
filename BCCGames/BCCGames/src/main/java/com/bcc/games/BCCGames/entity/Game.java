package com.bcc.games.BCCGames.entity;

import jakarta.persistence.*;

@Entity(name = "games")
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(unique = true, nullable = false)
    private String title;
    @Column(nullable = false)
    private String genre;
    @Column(nullable = false)
    private Double price;
    @ManyToOne
    @JoinColumn(name = "studio_id")
    private Studio studio;

    public Game() {
    }

    public Game(long id, String title, String genre, Double price, Studio studio) {
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.price = price;
        this.studio = studio;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Studio getStudio() {
        return studio;
    }

    public void setStudio(Studio studio) {
        this.studio = studio;
    }
}
