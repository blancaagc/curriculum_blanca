package com.bagc.curriculumapi.validator;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidationsUtils {


    public static boolean isValidString(String str) {

        if (str == null || str.isEmpty()) return false;
        // Check if str is comprised only of one or more whitespaces (unaccepted).
        Pattern patternString = Pattern.compile(
                "^\\s+$"
        );
        Matcher matcherString = patternString.matcher(str);
        return !matcherString.find();

    }

    public static boolean isValidEmail(String email) {
        Pattern patternEmail = Pattern.compile(
                "^[\\p{L}\\p{N}\\._%+-]+@[\\p{L}\\p{N}\\.\\-]+\\.[\\p{L}]{2,}$"
        );
        Matcher matcherEmail = patternEmail.matcher(email);
        return matcherEmail.find();
    }
}
