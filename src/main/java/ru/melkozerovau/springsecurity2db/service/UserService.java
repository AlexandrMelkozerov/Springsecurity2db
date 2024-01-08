package ru.melkozerovau.springsecurity2db.service;

import ru.melkozerovau.springsecurity2db.dto.UserDto;
import ru.melkozerovau.springsecurity2db.entity.User;

import java.util.List;

public interface UserService {
    void saveUser(UserDto userDto);

    User findUserByEmail(String email);

    List<UserDto> findAllUsers();
}
