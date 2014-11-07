package com.nelvido.ci.service;

import org.springframework.stereotype.Service;

import com.nelvido.ci.domain.Job;
import com.nelvido.ci.repository.JobRepository;

@Service
public class JobService extends AbstractEntityService<Job, JobRepository> {

}
