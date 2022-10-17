package com.example.demo.db.controller.album;

import com.example.demo.db.model.album.Design;
import com.example.demo.db.service.album.DesignService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class DesignController {

    private final DesignService designService;

    public DesignController(DesignService designService) {
        this.designService = designService;
    }

    @GetMapping("/designs")
    public String findAll(Model model) {
        List<Design> designs = designService.findAll();
        model.addAttribute("designs", designs);
        return "album/design-list";
    }

    @GetMapping("/design-create")
    public String createDesignForm(Design design) {
        return "album/design-create";
    }

    @PostMapping("design-create")
    public String createDesign(Design design) {
        designService.saveDesign(design);
        return "redirect:/designs";
    }

    @GetMapping("design-delete/{id}")
    public String deleteDesign(@PathVariable("id") Long id) {
        designService.deleteById(id);
        return "redirect:/designs";
    }

    @GetMapping("design-update/{id}")
    public String updateDesignForm(@PathVariable("id") Long id, Model model) {
        Design design = designService.findById(id);
        model.addAttribute("design", design);
        return "album/design-update";
    }

    @PostMapping("design-update")
    public String updateDesign(Design design) {
        designService.saveDesign(design);
        return "redirect:/designs";
    }
}
