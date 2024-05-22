package com.monolith.Monolith.job;

import java.util.List;

public interface JobService {
    List<Job> findAll();

    void createJob(Job jobs);

    Job getJobById(Long id);

    boolean deleteJobById(Long id);

    boolean updateJob(Long id, Job updatedJob);
}
