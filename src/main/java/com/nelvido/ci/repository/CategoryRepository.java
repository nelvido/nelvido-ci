package com.nelvido.ci.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.nelvido.ci.domain.Category;

@Repository
public interface CategoryRepository extends PagingAndSortingRepository<Category, Long> {

}
