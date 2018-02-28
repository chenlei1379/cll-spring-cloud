package com.cll.cloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cll.cloud.entity.UserInfo;
import com.cll.cloud.repository.UserInfoRepository;

@RestController
public class UserInfoController {

	@Autowired
	UserInfoRepository userInfoRepository;
	
	@GetMapping("/simple/{id}")
	public UserInfo findById(@PathVariable Long id) {
		
		return userInfoRepository.findOne(id);
	}
}
