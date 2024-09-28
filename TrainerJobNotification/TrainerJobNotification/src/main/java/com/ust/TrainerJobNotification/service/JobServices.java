package com.ust.TrainerJobNotification.service;


import com.ust.TrainerJobNotification.model.JobNotification;
import com.ust.TrainerJobNotification.repo.Jobrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JobServices {
    @Autowired
    private Jobrepo jobRepository;

    public JobNotification addJob(JobNotification job) {
        return jobRepository.save(job);
    }

    public List<JobNotification> getAllJobs() {
        return jobRepository.findAll();
    }

    public Optional<JobNotification> getJobById(Long jobId) {
        return jobRepository.findById(jobId);
    }
}