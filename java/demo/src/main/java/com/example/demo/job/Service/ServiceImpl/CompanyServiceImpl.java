package com.example.demo.job.Service.ServiceImpl;

import com.example.demo.job.Entities.Company;
import com.example.demo.job.Repository.CompanyRepository;
import com.example.demo.job.Service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class CompanyServiceImpl implements CompanyService {

    @Autowired
    private CompanyRepository companyRepository;

    @Override
    public List<Company> findAllCompanies() {
        return companyRepository.findAll();
    }

    @Override
    public Company findOneCompany(Long id) {
        return companyRepository.findById(id).orElse(null);
    }

    @Override
    public void createCompany(Company company) {
        companyRepository.save(company);
    }

    @Override
    public String deleteCompany(Long id) {
        companyRepository.deleteById(id);
        return "Successfully deleted company";
    }

    @Override
    @Transactional
    public Company updateCompany(Long id, Company updatedCompany) {
        Optional<Company> optionalCompany = companyRepository.findById(id);

        if (optionalCompany.isPresent()) {
            Company company = optionalCompany.get();
            company.setTitle(updatedCompany.getTitle());
            company.setDescription(updatedCompany.getDescription());
            company.setLocation(updatedCompany.getLocation());
            companyRepository.save(company);
            return company;
        }

        return null;
    }
}
