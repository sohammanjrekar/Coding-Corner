package com.example.demo.job.Service;

import java.util.List;

import com.example.demo.job.Entities.Company;

public interface CompanyService {

    List<Company> findAllCompanies();

    Company findOneCompany(Long id);

    void createCompany(Company company);

    String deleteCompany(Long id);

    Company updateCompany(Long id, Company company);

}
