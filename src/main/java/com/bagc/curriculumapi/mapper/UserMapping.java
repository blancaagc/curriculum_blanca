package com.bagc.curriculumapi.mapper;

import com.bagc.curriculumapi.model.UserResponse;
import net.rakugakibox.spring.boot.orika.OrikaMapperFactoryConfigurer;
import org.springframework.stereotype.Component;

import ma.glasnost.orika.MapperFactory;

@Component
public class UserMapping implements OrikaMapperFactoryConfigurer {

    @Override
    public void configure(MapperFactory orikaMapperFactory) {
        orikaMapperFactory.classMap(com.bagc.curriculumapi.model.User.class, UserResponse.class).mapNulls(false).byDefault().register();

    }
}