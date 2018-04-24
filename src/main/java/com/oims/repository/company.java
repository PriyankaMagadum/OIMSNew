package com.oims.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oims.model.Company;

public interface company extends JpaRepository<Company, Integer> {

}
