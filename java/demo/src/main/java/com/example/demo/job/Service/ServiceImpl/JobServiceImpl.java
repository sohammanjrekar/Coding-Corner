package com.example.demo.job.Service.ServiceImpl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.job.Entities.Job;
import com.example.demo.job.Repository.JobRepository;
import com.example.demo.job.Service.JobService;

@Service
public class JobServiceImpl implements JobService {
    // private List<Job> jobs = new ArrayList<>();

    @Autowired
    JobRepository jobRepository;

    @Override
    public List<Job> findAll() {
        return jobRepository.findAll();
    }

    @Override
    public void createJob(Job job) {
        jobRepository.save(job);
    }

    @Override
    public Job findOne(Long id) {
        return jobRepository.findById(id).orElse(null);
    }

    @Override
    public String deleteJob(Long id) {
        jobRepository.deleteById(id);
        return "sucessfully deleted";
    }

    @Override
    @Transactional
    public Job updatejob(Long id, Job updateJob) {
        Optional<Job> jobs = jobRepository.findById(id);
        if (jobs.isPresent()) {
            Job job = jobs.get();
            job.setTitle(updateJob.getTitle());
            job.setDescription(updateJob.getDescription());
            job.setLocation(updateJob.getLocation());
            job.setMaxSalary(updateJob.getMaxSalary());
            job.setMinSalary(updateJob.getMinSalary());
            jobRepository.save(job);
            return job;

        }
        return null;
    }

}
