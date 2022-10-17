package com.example.demo.db.service.author;

import com.example.demo.db.model.author.InstrumentPosession;
import com.example.demo.db.repository.author.InstrumentPosessionRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InstrumentPosessionService {
    private final InstrumentPosessionRepo instrumentPosessionRepo;

    public InstrumentPosessionService(InstrumentPosessionRepo instrumentPosessionRepo) {
        this.instrumentPosessionRepo = instrumentPosessionRepo;
    }

    public InstrumentPosession findById(Long id) {
        return instrumentPosessionRepo.getOne(id);
    }

    public List<InstrumentPosession> findAll() {
        return instrumentPosessionRepo.findAll();
    }

    public InstrumentPosession saveInstrumentPosession(InstrumentPosession posession) {
        return instrumentPosessionRepo.save(posession);
    }

    public void deleteById(Long id) {
        instrumentPosessionRepo.deleteById(id);
    }
}

