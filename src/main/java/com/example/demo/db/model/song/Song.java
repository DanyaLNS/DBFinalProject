package com.example.demo.db.model.song;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "song")
public class Song {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "song_name")
    private String songName;
    @Column(name = "author_id")
    private Long authorId;
    @Column(name = "mysic_id")
    private Long musicId;
    @Column(name = "lyrics_id")
    private Long lyricsId;
    @Column(name = "musical_album_id")
    private Long musicalAlbumId;
}
