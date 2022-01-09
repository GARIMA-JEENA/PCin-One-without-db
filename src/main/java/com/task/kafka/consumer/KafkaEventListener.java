

package com.task.kafka.consumer;


import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

@Component
public class KafkaEventListener {
	@KafkaListener(topics="${kafka.topic}")
	public void listen(Message<String> message) {
		
		//save to DATABASE.
		String payload=message.getPayload();
		System.out.println(payload);
	}
	

}

