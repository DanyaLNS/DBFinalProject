package com.example.demo.db.model.song;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "lyrics")
public class Lyrics {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "concept")
    private String concept;
    @Column(name = "text")
    private String text;
}
