package com.nelvido.ci.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.nelvido.ci.domain.AbstractEntity;
import com.nelvido.ci.domain.User;

public abstract class AbstractEntityService<ENTITY extends AbstractEntity, REPOSITORY extends PagingAndSortingRepository<ENTITY, Long>> {

    @Autowired
    protected REPOSITORY repository;

    public Page<ENTITY> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

    public ENTITY findOne(Long id) {
        return repository.findOne(id);
    }

    public ENTITY save(ENTITY entity, User user) {
        Date now = new Date();
        if (entity.getId() == null) {
            entity.setCreator(user);
            entity.setCreated(now);
        }
        entity.setModifier(user);
        entity.setModified(now);
        return repository.save(entity);
    }

    public Iterable<ENTITY> save(Iterable<ENTITY> entities, User user) {
        Date now = new Date();
        for (ENTITY entity : entities) {
            if (entity.getId() == null) {
                entity.setCreator(user);
                entity.setCreated(now);
            }
            entity.setModifier(user);
            entity.setModified(now);
        }
        return repository.save(entities);
    }

    public void delete(ENTITY entity) {
        repository.delete(entity);
    }

    public void delete(Iterable<ENTITY> entities) {
        repository.delete(entities);
    }

    public Long count() {
        return repository.count();
    }
}
