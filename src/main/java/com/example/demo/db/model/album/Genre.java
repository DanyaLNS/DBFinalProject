package com.example.demo.db.model.album;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "genre")
public class Genre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "style")
    private String style;
    @Column(name = "genre_name")
    private String genreName;
}
