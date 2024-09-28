package com.ust.TrainerJobNotification.repo;

import com.ust.TrainerJobNotification.model.JobNotification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface Jobrepo extends JpaRepository<JobNotification,Long> {
}
