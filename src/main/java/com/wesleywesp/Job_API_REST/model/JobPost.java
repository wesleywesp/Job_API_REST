package com.wesleywesp.Job_API_REST.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class JobPost {

    private int id;
    private String postProfile;
    private String postDesc;
    private int reqExperience;
    private List<String> postTechStack;

    public JobPost(JobPostDTO dados) {
        this(dados.postId(), dados.postProfile(), dados.postDesc(), dados.reqExperience()
        ,dados.postTechStack());
    }
}
