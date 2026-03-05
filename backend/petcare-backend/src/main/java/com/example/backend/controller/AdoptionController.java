package com.example.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.backend.model.Adoption;
import com.example.backend.service.AdoptionService;

@RestController
@RequestMapping("/api/adoptions")
public class AdoptionController {

    @Autowired
    private AdoptionService adoptionService;

    // Only veterinarians can add pets for adoption
    @PostMapping("/veterinarian/{vetId}")
    public Adoption addAdoption(@RequestBody Adoption adoption, @PathVariable Long vetId) {
        return adoptionService.createAdoption(adoption, vetId);
    }

    @GetMapping
    public List<Adoption> getAllAdoptions() {
        return adoptionService.getAllAdoptions();
    }

    @GetMapping("/veterinarian/{vetId}")
    public List<Adoption> getAdoptionsByVet(@PathVariable Long vetId) {
        return adoptionService.getAdoptionsByVet(vetId);
    }

    @DeleteMapping("/{id}")
    public void deleteAdoption(@PathVariable Long id) {
        adoptionService.deleteAdoption(id);
    }
}
