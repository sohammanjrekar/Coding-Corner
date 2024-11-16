package com.example.demo.job.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.job.Entities.Review;

public interface ReviewRepository extends JpaRepository<Review, Long> {

    List<Review> findReviewsByCompanyId(Long companyId);

    List<Review> findReviewsByJobId(Long jobId);

}
