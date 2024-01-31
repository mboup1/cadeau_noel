package com.app.cadeaunoel.repository;

import com.app.cadeaunoel.model.Cadeau;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CadeauRepository extends JpaRepository<Cadeau, Long> {
}
