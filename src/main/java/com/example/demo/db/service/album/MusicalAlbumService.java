package com.example.demo.db.service.album;

import com.example.demo.db.model.album.MusicalAlbum;
import com.example.demo.db.repository.album.MusicalAlbumRepo;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MusicalAlbumService {
    private final MusicalAlbumRepo musicalAlbumRepo;

    public MusicalAlbumService(MusicalAlbumRepo musicalAlbumRepo) {
        this.musicalAlbumRepo = musicalAlbumRepo;
    }

    public MusicalAlbum findById(Long id) {
        return musicalAlbumRepo.getOne(id);
    }

    public List<MusicalAlbum> findAll() {
        return musicalAlbumRepo.findAll();
    }

    public MusicalAlbum saveMusicalAlbum(MusicalAlbum musicalAlbum) {
        return musicalAlbumRepo.save(musicalAlbum);
    }

    public void deleteById(Long id) {
        musicalAlbumRepo.deleteById(id);
    }
}
