package com.rush.repos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rush.model.DietaryCategory;

@Repository
public interface DietCatDao extends CrudRepository<DietaryCategory, Long> {

}
