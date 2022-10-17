package com.example.demo.db.controller.album;

import com.example.demo.db.model.album.MusicalAlbum;
import com.example.demo.db.service.album.MusicalAlbumService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class MusicalAlbumController {

    private final MusicalAlbumService musicalAlbumService;

    public MusicalAlbumController(MusicalAlbumService musicalAlbumService) {
        this.musicalAlbumService = musicalAlbumService;
    }

    @GetMapping("/musical-album")
    public String findAll(Model model) {
        List<MusicalAlbum> albums = musicalAlbumService.findAll();
        model.addAttribute("albums", albums);
        return "album/musical-album-list";
    }

    @GetMapping("/musical-album-create")
    public String createMusicalAlbumForm(MusicalAlbum musicalAlbum) {
        return "album/musical-album-create";
    }

    @PostMapping("musical-album-create")
    public String createMusicalAlbum(MusicalAlbum musicalAlbum) {
        musicalAlbumService.saveMusicalAlbum(musicalAlbum);
        return "redirect:/musical-album";
    }

    @GetMapping("musical-album-delete/{id}")
    public String deleteMusicalAlbum(@PathVariable("id") Long id) {
        musicalAlbumService.deleteById(id);
        return "redirect:/musical-album";
    }

    @GetMapping("musical-album-update/{id}")
    public String updateMusicalAlbum(@PathVariable("id") Long id, Model model) {
        MusicalAlbum album = musicalAlbumService.findById(id);
        model.addAttribute("album", album);
        return "album/musical-album-update";
    }

    @PostMapping("musical-album-update")
    public String updateDesign(MusicalAlbum album) {
        musicalAlbumService.saveMusicalAlbum(album);
        return "redirect:/musical-album";
    }
}
