package com.example.demo.job.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;// basic crud operation

import com.example.demo.job.Entities.Job;

public interface JobRepository extends JpaRepository<Job, Long> {

}
