package io.springbootjpa.Courses;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepo extends CrudRepository<Courses,String>{

	//getAll Topics
	//getTopic {id}
	//updateTopic(Topic t)
	//deleteTopic(String id)
	
	public List<Courses> findByTopicId(String Id);
	
	
}
