package com.lt.rest;



import java.util.List;



import javax.ws.rs.core.MediaType;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;



import com.lt.dao.AdminDAO;
import com.lt.dao.AdminDAOImpl;
import com.lt.dto.Course;
import com.lt.dto.Professor;
//import com.lt.service.AdminServiceInterface;
import com.lt.exception.CourseNotFound;



//NOTE: Inject a class referrence object and autowired on top of it.
//NOTE: REST controller ----> Service ------> DAO
//REST controller will look upto the service and service will look up to DAO
@RestController // this will web enable this class as request will come in the form of URL and
// URI
@CrossOrigin // this annotation will enable the cross platform request which comes from any
// browser
public class AdminController  {



		@Autowired
		AdminDAOImpl admindao;
		
		@RequestMapping(produces = MediaType.APPLICATION_JSON, method = RequestMethod.GET, value = "/courselist")
		@ResponseBody
		public List getCourseDetails() {
		  return admindao.listCourses();
		}

		@RequestMapping(produces = MediaType.APPLICATION_JSON, method = RequestMethod.DELETE, value = "/deletecourse/{courseCode}")
		@ResponseBody
		public int deleteCourse(@PathVariable Integer courseCode) {

			if (null == (admindao.removeCourse(courseCode))) {
			    throw new CourseNotFound(courseCode);
			}

		  return courseCode;
		}
		
		@RequestMapping(produces = MediaType.APPLICATION_JSON, method = RequestMethod.POST, value = "/addprofessor")
		@ResponseBody
		public ResponseEntity<Professor> addProfessor(@RequestBody Professor professor) {
		
		      admindao.addProfessor(professor);
		      return new ResponseEntity<Professor>(professor, HttpStatus.OK);	
		}

		@RequestMapping(produces = MediaType.APPLICATION_JSON, method = RequestMethod.POST, value = "/addcourse")
		@ResponseBody
		public ResponseEntity<Course> addcourse(@RequestBody Course course) {

	    	admindao.addcourse(course);
	    	return new ResponseEntity<Course>(course, HttpStatus.OK);

		}
		
		@RequestMapping(produces = MediaType.APPLICATION_JSON, method = RequestMethod.GET, value = "/generategradecard/{id}")
		@ResponseBody
		public List getCourseToTeach(@PathVariable("id") int studentId) {

			return null;
		}
}