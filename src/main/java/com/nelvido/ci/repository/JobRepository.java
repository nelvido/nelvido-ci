package com.nelvido.ci.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.nelvido.ci.domain.Job;

@Repository
public interface JobRepository extends PagingAndSortingRepository<Job, Long> {

}
