package io.springbootjpa.Courses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

	@Autowired
	private CourseRepo courseRepo;
	
	
	public List<Courses> getAllCourses(String id){
		List<Courses> courses = new ArrayList<>();
		courseRepo.findByTopicId(id).forEach(courses::add);
		return courses;
	}
	
	public Courses getCourse(String id) {
		// topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
		return courseRepo.findOne(id);
	}
	
	public void addCourse(Courses course) {
		courseRepo.save(course);
	}

	public void updateCourse(Courses topic) {
		// TODO Auto-generated method stub
		courseRepo.save(topic);
		
	}

	public void deleteCourse(String id) {
		// TODO Auto-generated method stub
		courseRepo.delete(id);
	}
}
