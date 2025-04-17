package com.api.member;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.api.repository.MemberRepository;
import com.api.repository.entity.Member;

@SpringBootTest
public class MemberRepositoryTest {

	@Autowired 
	private MemberRepository memberRepository;
	
	@Test
	public void crudTest() {
		Member member = Member.builder()
				.name("test")
				.phoneNumber("000-000-0000")
				.build();
		
//		memberRepository.save(member);
		Member saved = memberRepository.save(member);
		Member foundMember = memberRepository.findById(saved.getId())
				.orElseThrow(() -> new RuntimeException("Member not found"));

		System.out.println("조회된 멤버: " + foundMember);

	}
	
}
