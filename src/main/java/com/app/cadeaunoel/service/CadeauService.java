package com.app.cadeaunoel.service;


import com.app.cadeaunoel.model.Cadeau;
import com.app.cadeaunoel.repository.CadeauRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CadeauService {

    @Autowired
    private CadeauRepository cadeauRepository;

    public void add(Cadeau cadeau) {
        cadeauRepository.save(cadeau);
    }

    public List<Cadeau> getAll() {
        List<Cadeau> cadeaux = new ArrayList<>();
        cadeauRepository.findAll().forEach(cadeau -> cadeaux.add(cadeau));
        return cadeaux;
    }

    public Cadeau findById(Long id) {
        return cadeauRepository.findById(id).orElse(null);
    }

    public void delete(Long id) {
        cadeauRepository.deleteById(id);
    }

    public void update(Long id, Cadeau cadeau) {
        Cadeau existingCadeau = cadeauRepository.findById(id).orElse(null);
        if (existingCadeau != null) {
            cadeau.setId(id);
            cadeauRepository.save(cadeau);
        }
    }
}

