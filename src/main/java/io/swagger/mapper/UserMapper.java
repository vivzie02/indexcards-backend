package io.swagger.mapper;

import io.swagger.entity.User;
import io.swagger.model.UsersBody;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;

import java.util.Objects;

@Mapper
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);
    @Mapping(target = "password", ignore = true)
    User toEntity(UsersBody usersBody);
    UsersBody toModel(User user);
}
