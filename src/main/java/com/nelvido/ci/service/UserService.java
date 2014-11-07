package com.nelvido.ci.service;

import org.springframework.stereotype.Service;

import com.nelvido.ci.domain.User;
import com.nelvido.ci.repository.UserRepository;

@Service
public class UserService extends AbstractEntityService<User, UserRepository> {

}
