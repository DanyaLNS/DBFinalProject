package com.example.demo.db.repository.song;

import com.example.demo.db.model.song.Music;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MusicRepo extends JpaRepository<Music, Long> {
}
