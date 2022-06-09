package com.lt.repository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


import com.lt.entity.CourseRegistration;

public interface CourseRegistrationRepository extends CrudRepository<CourseRegistration,Integer> {

	@Modifying
	@Query(value="delete from course_registration where studentid = ?1 and coursecode = ?2", nativeQuery=true)
	public void deleteCourse(int studentid, int courseid);
}
