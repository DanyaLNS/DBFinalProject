package com.example.demo.db.model.album;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "design")
public class Design {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "design_name")
    private String designName;
    @Column(name = "path_to_design")
    private String pathToDesign;
}
