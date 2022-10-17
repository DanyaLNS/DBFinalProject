package com.example.demo.db.model.author;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "author")
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;
    @Column(name = "email")
    private String email;
    @Column(name = "instrument_posession_id")
    private Long instrumentPosessionId;
    @Column(name = "work_experience_id")
    private Long workExperienceId;
}
