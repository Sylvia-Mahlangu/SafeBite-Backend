package org.example.safebitebackend.repository;

import org.example.safebitebackend.domain.FoodEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository
        extends JpaRepository<FoodEntity, Long> {

}