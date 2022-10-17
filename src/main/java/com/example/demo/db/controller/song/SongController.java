package com.example.demo.db.controller.song;

import com.example.demo.db.model.song.Song;
import com.example.demo.db.service.song.SongService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class SongController {

    private final SongService songService;

    public SongController(SongService songService) {
        this.songService = songService;
    }

    @GetMapping("/song")
    public String findAll(Model model) {
        List<Song> songs = songService.findAll();
        model.addAttribute("songs", songs);
        return "song/song-list";
    }

    @GetMapping("/song-create")
    public String createSongForm(Song song) {
        return "song/song-create";
    }

    @PostMapping("song-create")
    public String createSong(Song song) {
        songService.saveSong(song);
        return "redirect:/song";
    }

    @GetMapping("song-delete/{id}")
    public String deleteSong(@PathVariable("id") Long id) {
        songService.deleteById(id);
        return "redirect:/song";
    }

    @GetMapping("song-update/{id}")
    public String updateSongForm(@PathVariable("id") Long id, Model model) {
        Song song = songService.findById(id);
        model.addAttribute("song", song);
        return "song/song-update";
    }

    @PostMapping("song-update")
    public String updateSong(Song song) {
        songService.saveSong(song);
        return "redirect:/song";
    }
}
