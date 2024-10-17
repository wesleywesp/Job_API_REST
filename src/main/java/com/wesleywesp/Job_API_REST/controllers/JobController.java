package com.wesleywesp.Job_API_REST.controllers;


import com.wesleywesp.Job_API_REST.model.JobPost;
import com.wesleywesp.Job_API_REST.model.JobPostDTO;
import com.wesleywesp.Job_API_REST.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class JobController {
    @Autowired
    private JobService service;

    @GetMapping({"jobs"})
    public ResponseEntity<List> jobs(){
        List<JobPost> jobs = service.getAllJobs();
        return ResponseEntity.ok(jobs);
    }

//    @GetMapping("addjob")
//    public String addjob(){
//        return "addjob";
//    }
//
//
    @PostMapping("handleForm")
    public  ResponseEntity handlrForm(@RequestBody JobPost dados){
       service.addJob(dados);
        return ResponseEntity.ok(new JobPostDTO(dados));

    }
//    @GetMapping("viewalljobs")
//    public String viewalljobs(Model m){
//        List<JobPost> jobs = service.getAllJobs();
//        m.addAttribute("jobPosts", jobs);
//        return "viewalljobs";

}
