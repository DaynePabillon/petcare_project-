package com.example.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.backend.model.Adoption;
import com.example.backend.model.Veterinarian;
import com.example.backend.repository.AdoptionRepository;
import com.example.backend.repository.VeterinarianRepository;

@Service
public class AdoptionService {

    @Autowired
    private AdoptionRepository adoptionRepository;

    @Autowired
    private VeterinarianRepository veterinarianRepository;

    public Adoption createAdoption(Adoption adoption, Long vetId) {
        Veterinarian vet = veterinarianRepository.findById(vetId)
                .orElseThrow(() -> new RuntimeException("Veterinarian not found"));

        adoption.setVeterinarian(vet);
        return adoptionRepository.save(adoption);
    }

    public List<Adoption> getAllAdoptions() {
        return adoptionRepository.findAll();
    }

    public List<Adoption> getAdoptionsByVet(Long vetId) {
        Veterinarian vet = veterinarianRepository.findById(vetId)
                .orElseThrow(() -> new RuntimeException("Veterinarian not found"));

        return adoptionRepository.findByVeterinarian(vet);
    }

    public void deleteAdoption(Long id) {
        adoptionRepository.deleteById(id);
    }
}
