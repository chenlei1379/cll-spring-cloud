package com.cll.cloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.cll.cloud.entity.UserInfo;

@RestController
public class MovieController {
	
	@Autowired
	RestTemplate restTemplate;

	@GetMapping("/movie/{id}")
	public UserInfo findUserById(@PathVariable Long id) {
		return restTemplate.getForObject("http://localhost:7900/simple/"+id, UserInfo.class);
	}
}
