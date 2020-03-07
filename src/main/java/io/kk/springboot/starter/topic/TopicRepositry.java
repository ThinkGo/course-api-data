package io.kk.springboot.starter.topic;

import org.springframework.data.repository.CrudRepository;

public interface TopicRepositry 
					extends 
					CrudRepository<Topic, String>{
								 //<T, ID> match gneric Types=Topic, ID Type = String
}
