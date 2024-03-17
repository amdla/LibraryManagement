package com.example.model;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AuthorsRepository extends JpaRepository<Authors, Long> {
    List<Authors> findByNameContaining(String name);
}