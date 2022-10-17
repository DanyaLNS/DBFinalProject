package com.example.demo.db.controller.author;

import com.example.demo.db.model.album.Genre;
import com.example.demo.db.model.author.InstrumentPosession;
import com.example.demo.db.service.album.GenreService;
import com.example.demo.db.service.author.InstrumentPosessionService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class InstrumentPosessionController {
    private final InstrumentPosessionService instrumentPosessionService;

    public InstrumentPosessionController(InstrumentPosessionService instrumentPosessionService) {
        this.instrumentPosessionService = instrumentPosessionService;
    }

    @GetMapping("/instrument-posession")
    public String findAll(Model model) {
        List<InstrumentPosession> instrumentPosessions = instrumentPosessionService.findAll();
        model.addAttribute("instrumentPosessions", instrumentPosessions);
        return "author/instrument-posession-list";
    }

    @GetMapping("/instrument-posession-create")
    public String createInstrumentPosessionForm(InstrumentPosession posession) {
        return "author/instrument-posession-create";
    }

    @PostMapping("instrument-posession-create")
    public String createInstrumentPosession(InstrumentPosession posession) {
        instrumentPosessionService.saveInstrumentPosession(posession);
        return "redirect:/instrument-posession";
    }

    @GetMapping("instrument-posession-delete/{id}")
    public String deleteInstrumentPosession(@PathVariable("id") Long id) {
        instrumentPosessionService.deleteById(id);
        return "redirect:/instrument-posession";
    }

    @GetMapping("instrument-posession-update/{id}")
    public String updateInstrumentPosessionForm(@PathVariable("id") Long id, Model model) {
        InstrumentPosession posession = instrumentPosessionService.findById(id);
        model.addAttribute("posession", posession);
        return "author/instrument-posession-update";
    }

    @PostMapping("instrument-posession-update")
    public String updateInstrumentPosession(InstrumentPosession posession) {
        instrumentPosessionService.saveInstrumentPosession(posession);
        return "redirect:/instrument-posession";
    }
}
