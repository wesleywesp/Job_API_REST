package com.wesleywesp.Job_API_REST.model;

import java.util.List;


public record JobPostDTO(int postId,
                         String postProfile,
                         String postDesc,
                         int reqExperience,
                         List<String> postTechStack ) {
    public JobPostDTO(JobPost dados) {
        this(dados.getId(), dados.getPostProfile(),
                dados.getPostDesc(), dados.getReqExperience(), dados.getPostTechStack());
    }
}
