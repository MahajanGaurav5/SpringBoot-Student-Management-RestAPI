package com.gaurav.Repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.gaurav.entities.StudentEntity;

@Repository
public interface studentRepo extends CrudRepository<StudentEntity, Integer>{

}
