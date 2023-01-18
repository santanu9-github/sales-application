package com.salesaplication2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.salesaplication2.entity.Lead;

public interface LeadRepository extends JpaRepository<Lead,Long> {

}
