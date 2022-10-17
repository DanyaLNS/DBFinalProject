package com.example.demo.db.model.song;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "music")
public class Music {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "tempo")
    private int tempo;
    @Column(name = "tonality")
    private String tonality;
    @Column(name = "path_to_music")
    private String pathToMusic;
}
