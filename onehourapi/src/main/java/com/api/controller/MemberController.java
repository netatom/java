package com.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.controller.dto.JoinRequest;
import com.api.service.MemberService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class MemberController {
	
	private final MemberService memberService;

	@GetMapping("/hello")
	public String getHello() {
		return "Hello";
	}
	
	@PostMapping("/join")
	public String join(@RequestBody JoinRequest joinRequest) {
		String name = joinRequest.getName();
		String phoneNumber = joinRequest.getPhoneNumber();
		
		String result = memberService.join(name, phoneNumber);
		
		if("success".equalsIgnoreCase(result )) {
			return "success";
		} else {
			return "fail";
		}
	}
	
}
