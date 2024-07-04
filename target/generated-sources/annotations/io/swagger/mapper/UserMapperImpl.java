package io.swagger.mapper;

import io.swagger.entity.User;
import io.swagger.model.UsersBody;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-07-04T23:21:16+0200",
    comments = "version: 1.6.0.Beta1, compiler: javac, environment: Java 19.0.1 (Oracle Corporation)"
)
public class UserMapperImpl implements UserMapper {

    @Override
    public User toEntity(UsersBody usersBody) {
        if ( usersBody == null ) {
            return null;
        }

        User user = new User();

        user.setUsername( usersBody.getUsername() );

        return user;
    }

    @Override
    public UsersBody toModel(User user) {
        if ( user == null ) {
            return null;
        }

        UsersBody usersBody = new UsersBody();

        usersBody.setUsername( user.getUsername() );
        usersBody.setPassword( user.getPassword() );

        return usersBody;
    }
}
