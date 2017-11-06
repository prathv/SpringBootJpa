package io.springbootjpa.Topic;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TopicRepo extends CrudRepository<Topic,String>{

	//getAll Topics
	//getTopic {id}
	//updateTopic(Topic t)
	//deleteTopic(String id)
	
	
	
	
}
