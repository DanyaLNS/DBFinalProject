package com.example.demo.db.controller.author;

import com.example.demo.db.model.album.Genre;
import com.example.demo.db.model.author.WorkExperience;
import com.example.demo.db.service.album.GenreService;
import com.example.demo.db.service.author.WorkExperienceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class WorkExperienceController {
    private final WorkExperienceService workExperienceService;

    public WorkExperienceController(WorkExperienceService workExperienceService) {
        this.workExperienceService = workExperienceService;
    }

    @GetMapping("/work-experience")
    public String findAll(Model model) {
        List<WorkExperience> experiences = workExperienceService.findAll();
        model.addAttribute("experiences", experiences);
        return "author/work-experience-list";
    }

    @GetMapping("/work-experience-create")
    public String createWorkExperienceForm(WorkExperience experience) {
        return "author/work-experience-create";
    }

    @PostMapping("work-experience-create")
    public String createWorkExperience(WorkExperience experience) {
        workExperienceService.saveWorkExperience(experience);
        return "redirect:/work-experience";
    }

    @GetMapping("work-experience-delete/{id}")
    public String deleteWorkExperience(@PathVariable("id") Long id) {
        workExperienceService.deleteById(id);
        return "redirect:/work-experience";
    }

    @GetMapping("work-experience-update/{id}")
    public String updateWorkExperienceForm(@PathVariable("id") Long id, Model model) {
        WorkExperience experience = workExperienceService.findById(id);
        model.addAttribute("experience", experience);
        return "author/work-experience-update";
    }

    @PostMapping("work-experience-update")
    public String updateWorkExperience(WorkExperience experience) {
        workExperienceService.saveWorkExperience(experience);
        return "redirect:/work-experience";
    }
}
