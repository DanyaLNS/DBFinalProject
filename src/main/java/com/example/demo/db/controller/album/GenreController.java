package com.example.demo.db.controller.album;

import com.example.demo.db.model.album.Genre;
import com.example.demo.db.service.album.GenreService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class GenreController {

    private final GenreService genreService;

    public GenreController(GenreService genreService) {
        this.genreService = genreService;
    }

    @GetMapping("/genre")
    public String findAll(Model model) {
        List<Genre> genres = genreService.findAll();
        model.addAttribute("genres", genres);
        return "album/genre-list";
    }

    @GetMapping("/genre-create")
    public String createDesignForm(Genre genre) {
        return "album/genre-create";
    }

    @PostMapping("genre-create")
    public String createDesign(Genre genre) {
        genreService.saveGenre(genre);
        return "redirect:/genre";
    }

    @GetMapping("genre-delete/{id}")
    public String deleteDesign(@PathVariable("id") Long id) {
        genreService.deleteById(id);
        return "redirect:/genre";
    }

    @GetMapping("genre-update/{id}")
    public String updateDesignForm(@PathVariable("id") Long id, Model model) {
        Genre genre = genreService.findById(id);
        model.addAttribute("genre", genre);
        return "album/genre-update";
    }

    @PostMapping("genre-update")
    public String updateDesign(Genre genre) {
        genreService.saveGenre(genre);
        return "redirect:/genre";
    }
}
