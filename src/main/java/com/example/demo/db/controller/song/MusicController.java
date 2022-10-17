package com.example.demo.db.controller.song;

import com.example.demo.db.model.song.Music;
import com.example.demo.db.service.song.MusicService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class MusicController {

    private final MusicService musicService;

    public MusicController(MusicService musicService) {
        this.musicService = musicService;
    }

    @GetMapping("/music")
    public String findAll(Model model) {
        List<Music> musics = musicService.findAll();
        model.addAttribute("musics", musics);
        return "song/music-list";
    }

    @GetMapping("/music-create")
    public String createMusicForm(Music music) {
        return "song/music-create";
    }

    @PostMapping("music-create")
    public String createMusic(Music music) {
        musicService.saveMusic(music);
        return "redirect:/music";
    }

    @GetMapping("music-delete/{id}")
    public String deleteMusic(@PathVariable("id") Long id) {
        musicService.deleteById(id);
        return "redirect:/music";
    }

    @GetMapping("music-update/{id}")
    public String updateMusicForm(@PathVariable("id") Long id, Model model) {
        Music music = musicService.findById(id);
        model.addAttribute("music", music);
        return "song/music-update";
    }

    @PostMapping("music-update")
    public String updateMusic(Music music) {
        musicService.saveMusic(music);
        return "redirect:/music";
    }
}
