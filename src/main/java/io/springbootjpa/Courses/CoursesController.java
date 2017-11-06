package io.springbootjpa.Courses;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.springbootjpa.Topic.Topic;

@RestController
public class CoursesController {
	
	@Autowired
	private CourseService courseService;
	
	@RequestMapping("/topics/{id}/courses")
	public List<Courses> getCourses(@PathVariable String id) {
		return courseService.getAllCourses(id);
	}
	
	@RequestMapping("/topics/{topicid}/courses/{id}")
	public Courses getTopic(@PathVariable String id){
		return courseService.getCourse(id);
	
	}
	
	
	@RequestMapping(method=RequestMethod.POST,value="/topics/{topicId}/courses")
	public void addCourse(@RequestBody Courses course,@PathVariable String topicId) {
		course.setTopic(new Topic(topicId,"",""));
		this.courseService.addCourse(course);
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/topics/{topicId}/courses/{id}")
	public void updateCourse(@RequestBody Courses course, @PathVariable String id, @PathVariable String topicId) {
		course.setTopic(new Topic(topicId,"",""));

		this.courseService.updateCourse(course);
	}
	

	@RequestMapping(method=RequestMethod.DELETE,value="/topics/{topicid}/course/{id}")
	public void deleteTopic(@PathVariable String id) {
		this.courseService.deleteCourse(id);
	}
	
	
}
