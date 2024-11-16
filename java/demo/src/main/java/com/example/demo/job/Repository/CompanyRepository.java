package com.example.demo.job.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.job.Entities.Company;

public interface CompanyRepository extends JpaRepository<Company, Long> {

}
