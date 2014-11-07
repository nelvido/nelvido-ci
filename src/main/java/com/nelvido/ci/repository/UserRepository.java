package com.nelvido.ci.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.nelvido.ci.domain.User;

@Repository
public interface UserRepository extends PagingAndSortingRepository<User, Long> {

}
