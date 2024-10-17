package com.wesleywesp.Job_API_REST.service;


import com.wesleywesp.Job_API_REST.model.JobPost;
import com.wesleywesp.Job_API_REST.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class JobService {
    @Autowired
    private JobRepository repository;

    public void  addJob(JobPost jobPost){
        repository.addJob(jobPost);

    }
    public List<JobPost> getAllJobs(){
        return repository.getAllJobs();
    }
}
