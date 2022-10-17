package com.example.demo.db.repository.album;

import com.example.demo.db.model.album.Genre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenreRepo extends JpaRepository<Genre, Long> {
}
