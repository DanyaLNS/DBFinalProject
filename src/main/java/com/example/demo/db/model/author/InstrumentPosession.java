package com.example.demo.db.model.author;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "instrument_posession")
public class InstrumentPosession {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "instrument_name")
    private String instrumentName;
    @Column(name = "level_of_playing")
    private String levelOfPlaying;
}
