package com.dailycodebuffer.spring.data.jpa.tutorial.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<> {
}
