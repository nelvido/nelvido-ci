package com.nelvido.ci.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.nelvido.ci.domain.Project;

@Repository
public interface ProjectRepository extends PagingAndSortingRepository<Project, Long> {

}
