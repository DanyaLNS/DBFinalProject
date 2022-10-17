package com.example.demo.db.repository.song;

import com.example.demo.db.model.song.Lyrics;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LyricsRepo extends JpaRepository<Lyrics, Long> {
}
