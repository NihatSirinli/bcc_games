package com.bcc.games.BCCGames.model.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
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

    public Game(long id, String title, String genre, Double price, Studio studio) {
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.price = price;
        this.studio = studio;
    }
}
