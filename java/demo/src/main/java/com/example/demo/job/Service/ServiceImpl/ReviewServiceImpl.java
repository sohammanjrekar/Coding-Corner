package com.example.demo.job.Service.ServiceImpl;

import com.example.demo.job.Entities.Company;
import com.example.demo.job.Entities.Job;
import com.example.demo.job.Entities.Review;
import com.example.demo.job.Repository.*;
import com.example.demo.job.Service.*;

import jakarta.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReviewServiceImpl implements ReviewService {

    @Autowired
    private ReviewRepository reviewRepository;

    @Autowired
    private JobRepository jobRepository;

    @Autowired
    private CompanyRepository companyRepository;

    @Override
    public List<Review> findReviewsByCompany(Long companyId) {

        return reviewRepository.findReviewsByCompanyId(companyId);
    }

    @Override
    public List<Review> findReviewsByJob(Long jobId) {

        return reviewRepository.findReviewsByJobId(jobId);
    }

    @Override
    public Optional<Review> getReviewById(Long reviewId) {
        // Get a review by its ID
        return reviewRepository.findById(reviewId);
    }

    @Override
    public Review saveReviewForCompany(Long companyId, Review review) {
        Optional<Company> optionalCompany = companyRepository.findById(companyId);

        if (optionalCompany.isPresent()) {
            Company company = optionalCompany.get();
            review.setCompany(company);
            company.getReviews().add(review);
            companyRepository.save(company);
            return reviewRepository.save(review);
        } else {
            throw new EntityNotFoundException("Company not found with id: " + companyId);
        }
    }

    @Override
    public Review saveReviewForJob(Long jobId, Review review) {
        Optional<Job> optionalJob = jobRepository.findById(jobId);

        if (optionalJob.isPresent()) {
            Job job = optionalJob.get();
            review.setJob(job); // Set the relationship

            job.getReviews().add(review); // Optionally, add the review to the job's reviews list

            jobRepository.save(job); // Save the job, which will cascade the save to the associated reviews
            return reviewRepository.save(review); // Save the review
        } else {
            // Handle the case where the job with the given ID is not found
            return null;
        }
    }

}
