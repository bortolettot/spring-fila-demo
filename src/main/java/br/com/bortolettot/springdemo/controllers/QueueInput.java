package br.com.bortolettot.springdemo.controllers;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.bortolettot.springdemo.SpringDemoApplication;

@RestController
public class QueueInput {

	private RabbitTemplate rabbitTemplate;

	public QueueInput(RabbitTemplate rabbitTemplate) {
		this.rabbitTemplate = rabbitTemplate;
	}


	@RequestMapping(method = RequestMethod.GET, path="/in/string")
	public String greeting(@RequestParam(value="message") String message) {
		rabbitTemplate.convertAndSend(SpringDemoApplication.queueName, message);
		
		return "Olá "+message;
	}
}
