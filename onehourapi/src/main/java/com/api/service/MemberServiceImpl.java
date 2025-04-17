package com.api.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import com.api.repository.MemberRepository;
import com.api.repository.entity.Member;

@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService{

	private final MemberRepository memberRepository;
	
	@Override
	public String join(String name, String phoneNumber) {
		Member member = Member.builder()
				.name(name)
				.phoneNumber(phoneNumber)
				.build();
		memberRepository.save(member);
		return "success";
	}
}
