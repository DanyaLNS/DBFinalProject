package com.example.demo.db.service.song;

import com.example.demo.db.model.song.Music;
import com.example.demo.db.repository.song.MusicRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MusicService {
    private final MusicRepo musicRepo;

    public MusicService(MusicRepo musicRepo) {
        this.musicRepo = musicRepo;
    }

    public Music findById(Long id) {
        return musicRepo.getOne(id);
    }

    public List<Music> findAll() {
        return musicRepo.findAll();
    }

    public Music saveMusic(Music music) {
        return musicRepo.save(music);
    }

    public void deleteById(Long id) {
        musicRepo.deleteById(id);
    }
}
