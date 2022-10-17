package com.example.demo.db.controller.song;

import com.example.demo.db.model.song.Lyrics;
import com.example.demo.db.service.song.LyricsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class LyricsController {

    private final LyricsService lyricsService;

    public LyricsController(LyricsService lyricsService) {
        this.lyricsService = lyricsService;
    }

    @GetMapping("/lyrics")
    public String findAll(Model model) {
        List<Lyrics> lyrics = lyricsService.findAll();
        model.addAttribute("lyrics", lyrics);
        return "song/lyrics-list";
    }

    @GetMapping("/lyrics-create")
    public String createLyricsForm(Lyrics lyrics) {
        return "song/lyrics-create";
    }

    @PostMapping("lyrics-create")
    public String createLyrics(Lyrics lyrics) {
        lyricsService.saveLyrics(lyrics);
        return "redirect:/lyrics";
    }

    @GetMapping("lyrics-delete/{id}")
    public String deleteLyrics(@PathVariable("id") Long id) {
        lyricsService.deleteById(id);
        return "redirect:/lyrics";
    }

    @GetMapping("lyrics-update/{id}")
    public String updateLyricsForm(@PathVariable("id") Long id, Model model) {
        Lyrics lyrics = lyricsService.findById(id);
        model.addAttribute("lyrics", lyrics);
        return "song/lyrics-update";
    }

    @PostMapping("lyrics-update")
    public String updateLyrics(Lyrics lyrics) {
        lyricsService.saveLyrics(lyrics);
        return "redirect:/lyrics";
    }
}
