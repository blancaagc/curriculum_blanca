package com.bagc.curriculumapi.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class WorkExperience {

    private String title;
    private String company;
    private String from;
    private String to;
    private Boolean current;
    private String description;

}
