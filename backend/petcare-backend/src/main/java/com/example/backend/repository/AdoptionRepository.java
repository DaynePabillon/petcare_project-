package com.example.backend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.backend.model.Adoption;
import com.example.backend.model.Veterinarian;

public interface AdoptionRepository extends JpaRepository<Adoption, Long> {
    List<Adoption> findByVeterinarian(Veterinarian veterinarian);
}
