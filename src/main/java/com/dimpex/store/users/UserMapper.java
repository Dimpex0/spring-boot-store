package com.dimpex.store.users;

import com.dimpex.store.auth.RegisterUserRequest;
import com.dimpex.store.auth.UpdateUserRequest;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserDto toDto(User user);
    User toEntity(RegisterUserRequest request);
    void update(UpdateUserRequest request, @MappingTarget User user);
}
