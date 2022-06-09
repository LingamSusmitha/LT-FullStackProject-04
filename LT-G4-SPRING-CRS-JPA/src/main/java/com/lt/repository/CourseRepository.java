package com.lt.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.lt.entity.Course;

@Repository
public interface CourseRepository extends CrudRepository<Course,Integer>  {

}
