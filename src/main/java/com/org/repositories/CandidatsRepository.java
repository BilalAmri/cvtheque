package com.org.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.org.entities.Candidats;

public interface CandidatsRepository extends JpaRepository<Candidats, Long> {

}
