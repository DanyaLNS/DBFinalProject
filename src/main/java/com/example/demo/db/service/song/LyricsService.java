package com.example.demo.db.service.song;

import com.example.demo.db.model.song.Lyrics;
import com.example.demo.db.repository.song.LyricsRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LyricsService {
    private final LyricsRepo lyricsRepo;

    public LyricsService(LyricsRepo lyricsRepo) {
        this.lyricsRepo = lyricsRepo;
    }

    public Lyrics findById(Long id) {
        return lyricsRepo.getOne(id);
    }

    public List<Lyrics> findAll() {
        return lyricsRepo.findAll();
    }

    public Lyrics saveLyrics(Lyrics lyrics) {
        return lyricsRepo.save(lyrics);
    }

    public void deleteById(Long id) {
        lyricsRepo.deleteById(id);
    }
}
