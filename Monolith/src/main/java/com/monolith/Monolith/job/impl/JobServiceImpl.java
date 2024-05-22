package com.monolith.Monolith.job.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.monolith.Monolith.job.Job;
import com.monolith.Monolith.job.JobService;

@Service
public class JobServiceImpl implements JobService {

    private List<Job> jobs = new ArrayList<>();
    private Long nextId = 1L;

    @Override
    public List<Job> findAll() {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'findAll'");
        return jobs;
    }

    @Override
    public void createJob(Job job) {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'createJob'");
        job.setId(nextId++);
        jobs.add(job);
    }

    @Override
    public Job getJobById(Long id) {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'getJobById'");

        for (Job job : jobs) {
            if (job.getId().equals(id)) {
                return job;
            }
        }
        return null;
    }

    @Override
    public boolean deleteJobById(Long id) {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method
        // 'deleteJobById'");

        // for (Job job : jobs) {
        // if (job.getId().equals(id)) {
        // jobs.remove(job);
        // return true;
        // }
        // }
        // return false;

        Iterator<Job> iterator = jobs.iterator();
        while (iterator.hasNext()) {
            Job job = iterator.next();
            if (job.getId().equals(id)) {
                iterator.remove();
                return true;
            }
        }
        return false;
    }

}
