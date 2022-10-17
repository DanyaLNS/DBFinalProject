package com.example.demo.db.repository.author;

import com.example.demo.db.model.author.WorkExperience;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkExperienceRepo extends JpaRepository<WorkExperience, Long> {
}
