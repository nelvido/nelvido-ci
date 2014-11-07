package com.nelvido.ci.service;

import org.springframework.stereotype.Service;

import com.nelvido.ci.domain.Project;
import com.nelvido.ci.repository.ProjectRepository;

@Service
public class ProjectService extends AbstractEntityService<Project, ProjectRepository> {

}
