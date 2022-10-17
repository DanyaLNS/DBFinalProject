package com.example.demo.db.repository.song;

import com.example.demo.db.model.song.Song;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SongRepo extends JpaRepository<Song, Long> {
}
