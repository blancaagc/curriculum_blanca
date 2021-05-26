package com.bagc.curriculumapi.validator;

import com.bagc.curriculumapi.exception.BadRequestException;
import com.bagc.curriculumapi.model.*;
import org.springframework.stereotype.Service;
import static com.bagc.curriculumapi.validator.ValidationsUtils.*;

import java.util.ArrayList;
import java.util.List;
@Service
public class UserValidator implements Validator<User>{

    private static final String FIRST_NAME = "First name";

    private static final String LAST_NAME = "Last name";

    private static final String CORRECT_FORMAT_EMAIL = "an_accepted-email.example@domain.com.mx";
    private static final String MISSING_REQUIRED_INPUT ="Missing field" ;
    private static final String INVALID_INPUT = "Invalid field";


    @Override
    public void validate(User user) {
        validateFirstName(user.getFirstName());
        validateLastName(user.getLastname());
        validateJob(user.getJob());
        validateCity(user.getCity());
        validateEmailFormat(user.getEmail());
        validatePhoneNumber(user.getPhoneNumber());
        validateSkills(user.getSkills());
        validateLanguages(user.getLanguages());
        validateWorkExperience(user.getWorkExperience());
        validateEducation(user.getEducation());
        validateSocialMedia(user.getSocialMedia());
        validateChallenges(user.getChallenges());
        validateConfig(user.getConfig());
}

    private void validateConfig(Config config) {
    }

    private void validateChallenges(List<Challenges> challenges) {
    }

    private void validateSocialMedia(SocialMedia socialMedia) {
    }

    private void validateEducation(List<Education> education) {
    }

    private void validateWorkExperience(List<WorkExperience> workExperience) {
    }

    private void validateLanguages(List<Languages> languages) {
    }

    private void validateSkills(List<Skills> skills) {
    }

    private void validatePhoneNumber(String phoneNumber) {
        if (!isValidNumber(phoneNumber)) {
            throw new BadRequestException(
                    String.format(MISSING_REQUIRED_INPUT)
            );
        }
    }

    private void validateEmailFormat(String email) {
        if (!isValidString(email)) {
            throw new BadRequestException(
                    String.format(MISSING_REQUIRED_INPUT)
            );
        }
        if (!isValidEmail(email)) {
            throw new BadRequestException(
                    String.format(INVALID_INPUT, CORRECT_FORMAT_EMAIL)
            );
        }
    }

    private void validateCity(String city) {
        if (!isValidString(city)) {
            throw new BadRequestException(
                    String.format(MISSING_REQUIRED_INPUT)
            );
        }
    }

    private void validateJob(String job) {
        if (!isValidString(job)) {
            throw new BadRequestException(
                    String.format(MISSING_REQUIRED_INPUT)
            );
        }
    }

    private void validateLastName(String lastname) {
        if (!isValidString(lastname)) {
            throw new BadRequestException(
                    String.format(MISSING_REQUIRED_INPUT, LAST_NAME)
            );
        }
    }

    private void validateFirstName(String firstName) {
        if (!isValidString(firstName)) {
            throw new BadRequestException(
                    String.format(MISSING_REQUIRED_INPUT, FIRST_NAME)
            );
        }
    }
}
