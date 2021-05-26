package com.bagc.curriculumapi.validator;

public interface Validator<E>{
    void validate(E object);
}
