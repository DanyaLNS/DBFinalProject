package com.example.demo.db.model.author;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "work_experience")
public class WorkExperience {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "specialization")
    private String specialization;
    @Column(name = "place_of_work")
    private String placeOfWork;
    @Column(name = "description")
    private String description;
}
