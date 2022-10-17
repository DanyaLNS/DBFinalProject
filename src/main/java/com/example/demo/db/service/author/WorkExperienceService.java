package com.example.demo.db.service.author;

import com.example.demo.db.model.author.WorkExperience;
import com.example.demo.db.repository.author.WorkExperienceRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkExperienceService {
    private final WorkExperienceRepo workExperienceRepo;

    public WorkExperienceService(WorkExperienceRepo workExperienceRepo) {
        this.workExperienceRepo = workExperienceRepo;
    }
    public WorkExperience findById(Long id) {
        return  workExperienceRepo.getOne(id);
    }
    public List<WorkExperience> findAll(){
        return  workExperienceRepo.findAll();
    }
    public WorkExperience saveWorkExperience(WorkExperience workExperience) {
        return workExperienceRepo.save(workExperience);
    }
    public void deleteById(Long id) {
        workExperienceRepo.deleteById(id);
    }
}
