package com.adiwave.projects.dao.repository;

import com.adiwave.projects.dao.entity.Travel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TravelRepository extends JpaRepository<Travel, Integer> {
}
