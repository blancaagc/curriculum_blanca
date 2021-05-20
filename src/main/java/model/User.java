package model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Setter
@Getter
@Document(collection = "CVs")
public class User {
    @Id
    private String id;
    private String firstName;
    private String lastname;
    private String job;
    private String city;
    private String email;
    private String phoneNumber;
    private List<Skills> skills;
    private List<Languages> languages;
    private List<WorkExperience> workExperience;
    private List<Education> education;
    private List<SocialMedia> socialMedia;
    private List<Challenges> challenges;
    private Config config;
}
