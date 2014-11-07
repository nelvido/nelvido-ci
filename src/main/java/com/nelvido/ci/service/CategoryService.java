package com.nelvido.ci.service;

import org.springframework.stereotype.Service;

import com.nelvido.ci.domain.Category;
import com.nelvido.ci.repository.CategoryRepository;

@Service
public class CategoryService extends AbstractEntityService<Category, CategoryRepository> {

}
