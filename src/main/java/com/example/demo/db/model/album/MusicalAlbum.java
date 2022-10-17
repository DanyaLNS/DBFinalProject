package com.example.demo.db.model.album;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "musical_album")
public class MusicalAlbum {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "album_name")
    private String albumName;
    @Column(name = "songs_amount")
    private int songsAmount;
    @Column(name = "design_id")
    private Long designId;
    @Column(name = "genre_id")
    private Long genreId;
}
