package com.lt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lt.entity.CourseRegistration;
import com.lt.entity.Student;


@Repository
@Transactional
public interface StudentRepository extends CrudRepository<CourseRegistration,Integer> {
	
	@Modifying
	@Query(value="delete from course_registration where coursecode = ?1", nativeQuery=true)
	public void deleteCourse(int courseid);
	
	@Modifying
	@Query(value="select name,grade from course_registration where studentid = ?1", nativeQuery=true)
	public List getgrades(int studnetid);

}
