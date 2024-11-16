package com.example.demo.job.Service;

import java.util.List;
import java.util.Optional;

import com.example.demo.job.Entities.Review;

public interface ReviewService {

    List<Review> findReviewsByCompany(Long companyId);

    List<Review> findReviewsByJob(Long jobId);

    Optional<Review> getReviewById(Long reviewId);

    Review saveReviewForCompany(Long companyId, Review review);

    Review saveReviewForJob(Long jobId, Review review);
}
