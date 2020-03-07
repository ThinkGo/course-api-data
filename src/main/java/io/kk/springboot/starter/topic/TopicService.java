package io.kk.springboot.starter.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	@Autowired
	private TopicRepositry topicRepositry;
	
	//Create
	public void addTopic(Topic t) {
		topicRepositry.save(t);
	}

	//Rread
	public Topic getTopic(String id) {
		Topic topic = topicRepositry
			.findById(id)
			.orElse(new Topic());
		;
		return topic;
	}
	//Read
	public List<Topic> getAllTopics() {
		ArrayList<Topic> topics = new ArrayList<Topic>();
		topicRepositry
				.findAll()
				.forEach(topics::add);		//Consumer<? super Topic> action = topics::add;
		return topics;
	}

	//Uupdate
	public void updateTopic(Topic t) {
		topicRepositry.save(t);
	}
	
	//Delete
	public void deleteTopic(String id) {
		topicRepositry.deleteById(id);		
	}

}
