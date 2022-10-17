package com.example.demo.db.service.album;

import com.example.demo.db.model.album.Design;
import com.example.demo.db.repository.album.DesignRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DesignService {
    private final DesignRepo designRepo;

    public DesignService(DesignRepo designRepo) {
        this.designRepo = designRepo;
    }

    public Design findById(Long id) {
        return designRepo.getOne(id);
    }

    public List<Design> findAll() {
        return designRepo.findAll();
    }

    public Design saveDesign(Design design) {
        return designRepo.save(design);
    }

    public void deleteById(Long id) {
        designRepo.deleteById(id);
    }
}
