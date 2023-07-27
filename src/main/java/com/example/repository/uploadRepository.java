package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.Images;

public interface uploadRepository extends JpaRepository<Images, Integer> {

}