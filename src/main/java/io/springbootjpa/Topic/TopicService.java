package io.springbootjpa.Topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {

	@Autowired
	private TopicRepo topicRepo;
	
	
	public List<Topic> getAllTopics(){
		
		List<Topic> topics = new ArrayList<>();
		topicRepo.findAll().forEach(topics::add);
		return topics;
	}
	
	public Topic getTopic(String id) {
		// topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
		return topicRepo.findOne(id);
	}
	
	public void addTopic(Topic topic) {
		topicRepo.save(topic);
	}

	public void updateTopic(String id, Topic topic) {
		// TODO Auto-generated method stub
		topicRepo.save(topic);
		
	}

	public void deleteTopic(String id) {
		// TODO Auto-generated method stub
		topicRepo.delete(id);
	}
}
