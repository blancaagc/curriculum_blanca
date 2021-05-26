package com.bagc.curriculumapi.service;

import com.bagc.curriculumapi.model.User;
import com.bagc.curriculumapi.model.UserResponse;
import com.bagc.curriculumapi.repository.UserRepository;
import ma.glasnost.orika.MapperFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImp implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private MapperFacade orikaMapperFacade;


    @Override
    public UserResponse createUser(User request) {
        User user = userRepository.save(request);
        return orikaMapperFacade.map(user, UserResponse.class);
    }

    @Override
    public List<User> getAllUsers() {

        List<User> usersList = userRepository.findAll();
        return orikaMapperFacade.mapAsList(usersList, User.class);

    }

    @Override
    public User updateUserById(User request, String id) {
        request.setId(id);
        User userUpdatedFields = orikaMapperFacade.map(request, User.class);
        User updatedUser = userRepository.save(userUpdatedFields);
        return orikaMapperFacade.map(updatedUser, User.class);
    }


}
