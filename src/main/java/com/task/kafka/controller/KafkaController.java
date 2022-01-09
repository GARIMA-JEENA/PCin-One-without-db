package com.task.kafka.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.task.kafka.producer.KafkaMessageProducer;

@RestController
public class KafkaController {

	@Autowired
	KafkaMessageProducer kafkaMessageProducer;
	@PostMapping("/pushMessage")
	public String postMessage(@RequestBody String message) {
		kafkaMessageProducer.sendMesssage(message);
		return "Message Published Successfully .";
		
	}
	
	
}