package com.example.demo.job.Service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.job.Entities.Job;

public interface JobService {
    List<Job> findAll();

    void createJob(Job job);

    Job findOne(Long id);

    String deleteJob(Long id);

    Job updatejob(Long id, Job job);

}
