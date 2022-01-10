package com.assignment.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.assignment.spring.domain.WeatherEntity;

@Repository
public interface WeatherRepository extends JpaRepository<WeatherEntity, Integer> {
}
