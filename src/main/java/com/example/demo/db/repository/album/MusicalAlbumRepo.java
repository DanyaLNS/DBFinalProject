package com.example.demo.db.repository.album;

import com.example.demo.db.model.album.MusicalAlbum;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MusicalAlbumRepo extends JpaRepository<MusicalAlbum, Long> {
}
