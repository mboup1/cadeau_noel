package com.app.cadeaunoel.controller;

import com.app.cadeaunoel.model.Cadeau;
import com.app.cadeaunoel.service.CadeauService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api")
public class CadeauController {

    @Autowired
    private CadeauService cadeauService;

    // GET /cadeaux
    @GetMapping("cadeaux")
    public List<Cadeau> getCadeaux() {
        return cadeauService.getAll();
    }

    // POST /cadeaux
    @PostMapping("cadeaux")
    public void addCadeau(@RequestBody Cadeau newCadeau) {
        cadeauService.add(newCadeau);
    }

    // GET /cadeaux/1
    @GetMapping("cadeaux/{id}")
    public Cadeau getCadeauById(@PathVariable("id") Long id) {
        return cadeauService.findById(id);
    }

    @GetMapping("cadeaux/dto/{id}")
    public ResponseEntity<CadeauDTO> getCadeauByIdDTO(@PathVariable("id") Long id) {
        Optional<Cadeau> optional = Optional.ofNullable(cadeauService.findById(id));
        if(optional.isEmpty())
            return ResponseEntity.notFound().build();
        else {
            Cadeau cadeau = optional.get();
            CadeauDTO dto = CadeauMapper.convertEntityToDto(cadeau);

            dto.setPrixDTOAvecSymbole_€(String.format("%.2f €", cadeau.getPrix()));

            return ResponseEntity.ok(dto);
        }
    }

    // DELETE /cadeaux/1
    @DeleteMapping("cadeaux/{id}")
    public void deleteCadeau(@PathVariable("id") Long id) {
        cadeauService.delete(id);
    }

    // PUT /cadeaux/1
    @PutMapping("cadeaux/{id}")
    public void updateCadeau(@RequestBody Cadeau cadeau, @PathVariable("id") Long id) {
        cadeauService.update(id, cadeau);
    }
}
