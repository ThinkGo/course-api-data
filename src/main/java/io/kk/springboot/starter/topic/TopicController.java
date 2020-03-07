package io.kk.springboot.starter.topic;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	@Autowired
	private TopicService topicService;
	
	//Create
	@RequestMapping(method = RequestMethod.POST, value = "/topics")
	public void addTopic(@RequestBody Topic t) {
		topicService.addTopic(t);
	}

	//Read
	@RequestMapping("/topics")
	public List<Topic> getAllTopics() {
		return topicService.getAllTopics();
	}
	@RequestMapping("/topics/{id}")
	public Topic getAllTopic(@PathVariable String id) {
		return topicService.getTopic(id);
	}
	
	//Update
	@RequestMapping(method = RequestMethod.PUT, value = "/topics")
	public void addUpdate(@RequestBody Topic t) {
		topicService.updateTopic(t);
	}
	
	//Delete
	@RequestMapping(method = RequestMethod.DELETE, value = "/topics/{id}")
	public void deleteTopic(@PathVariable String id) {
		topicService.deleteTopic(id);
	}
}
