package com.example.demo.db.repository.author;

import com.example.demo.db.model.author.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepo extends JpaRepository<Author, Long> {
}
