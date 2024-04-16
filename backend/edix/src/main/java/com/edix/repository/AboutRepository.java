package com.edix.repository;

import com.edix.model.About;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;


public interface AboutRepository extends JpaRepository<About, UUID> {
}