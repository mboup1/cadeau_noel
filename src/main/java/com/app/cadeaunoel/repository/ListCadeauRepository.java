package com.app.cadeaunoel.repository;

import com.app.cadeaunoel.model.ListeCadeau;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ListCadeauRepository extends JpaRepository<ListeCadeau, Long> {
}
