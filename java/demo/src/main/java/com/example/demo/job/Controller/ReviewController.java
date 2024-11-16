package com.example.demo.job.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.job.Entities.Review;
import com.example.demo.job.Service.ReviewService;

@RestController
@RequestMapping("/")
public class ReviewController {

    @Autowired
    private ReviewService reviewService;

    // Get reviews for a specific company
    @GetMapping("/company/{companyId}")
    public List<Review> findReviewsByCompany(@PathVariable Long companyId) {
        // Implement a method in your ReviewService to fetch reviews by company ID
        return reviewService.findReviewsByCompany(companyId);
    }

    // Get reviews for a specific job
    @GetMapping("/job/{jobId}")
    public List<Review> findReviewsByJob(@PathVariable Long jobId) {
        // Implement a method in your ReviewService to fetch reviews by job ID
        return reviewService.findReviewsByJob(jobId);
    }

    // Create a new review for a job
    @PostMapping("/jobs/{jobId}/reviews")
    public ResponseEntity<Review> createReviewForJob(@PathVariable Long jobId, @RequestBody Review review) {
        Review savedReview = reviewService.saveReviewForJob(jobId, review);
        return new ResponseEntity<>(savedReview, HttpStatus.CREATED);
    }

    // Create a new review for a company
    @PostMapping("/company/{companyId}/reviews")
    public ResponseEntity<Review> createReviewForCompany(@PathVariable Long companyId, @RequestBody Review review) {
        Review savedReview = reviewService.saveReviewForCompany(companyId, review);
        return new ResponseEntity<>(savedReview, HttpStatus.CREATED);
    }

    // Get a review by ID
    @GetMapping("/{reviewId}")
    public ResponseEntity<Review> getReviewById(@PathVariable Long reviewId) {
        return reviewService.getReviewById(reviewId)
                .map(review -> new ResponseEntity<>(review, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
}
