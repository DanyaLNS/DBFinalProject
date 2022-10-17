package com.example.demo.db.service.album;

import com.example.demo.db.model.album.Genre;
import com.example.demo.db.repository.album.GenreRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GenreService {
    private final GenreRepo genreRepo;

    public GenreService(GenreRepo genreRepo) {
        this.genreRepo = genreRepo;
    }

    public Genre findById(Long id) {
        return genreRepo.getOne(id);
    }

    public List<Genre> findAll() {
        return genreRepo.findAll();
    }

    public Genre saveGenre(Genre genre) {
        return genreRepo.save(genre);
    }

    public void deleteById(Long id) {
        genreRepo.deleteById(id);
    }
}
