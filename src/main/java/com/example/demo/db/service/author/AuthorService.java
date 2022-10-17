package com.example.demo.db.service.author;

import com.example.demo.db.model.author.Author;
import com.example.demo.db.repository.author.AuthorRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService {
    private final AuthorRepo authorRepo;

    public AuthorService(AuthorRepo authorRepo) {
        this.authorRepo = authorRepo;
    }

    public Author findById(Long id) {
        return authorRepo.getOne(id);
    }

    public List<Author> findAll() {
        return authorRepo.findAll();
    }

    public Author saveAuthor(Author author) {
        return authorRepo.save(author);
    }

    public void deleteById(Long id) {
        authorRepo.deleteById(id);
    }
}
