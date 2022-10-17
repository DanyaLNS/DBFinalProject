package com.example.demo.db.service.song;

import com.example.demo.db.model.song.Song;
import com.example.demo.db.repository.song.SongRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SongService {
    private final SongRepo songRepo;

    public SongService(SongRepo songRepo) {
        this.songRepo = songRepo;
    }

    public Song findById(Long id) {
        return songRepo.getOne(id);
    }

    public List<Song> findAll() {
        return songRepo.findAll();
    }

    public Song saveSong(Song song) {
        return songRepo.save(song);
    }

    public void deleteById(Long id) {
        songRepo.deleteById(id);
    }
}
