package com.example.demo.controller;

import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.MemberDTO;

@RestController
@RequestMapping("/api/v1/put-api")
public class PutController {

  // http://localhost:8080/api/v1/put-api/default
  @PutMapping(value = "/start")
  public String putMethod() {
    return "Hello World!";
  }

  // http://localhost:8080/api/v1/put-api/member
  @PutMapping(value = "/member")
  public String postMember(@RequestBody Map<String, Object> putData) {
    StringBuilder sb = new StringBuilder();

    putData
        .entrySet()
        .forEach(
            map -> {
              sb.append(map.getKey() + " : " + map.getValue() + "\n");
            });
    return sb.toString();
  }

  // http://localhost:8080/api/v1/put-api/member1
  @PutMapping(value = "/member1")
  public String postMemberDto1(@RequestBody MemberDTO memberDTO) {
    return memberDTO.toString();
  }

  // http://localhost:8080/api/v1/put-api/member2
  @PutMapping(value = "/member2")
  public String postMemberDto(@RequestBody MemberDTO memberDTO) {
	  return "name : " + memberDTO.getName() + "\n"
      + "email : " + memberDTO.getEmail() + "\n"
      + "organization : " + memberDTO.getOrganization();
  }

  // http://localhost:8080/api/v1/put-api/member3
  @PutMapping(value = "/member3")
  public ResponseEntity<MemberDTO> postMemberDto3(@RequestBody MemberDTO memberDTO) {
    return ResponseEntity.status(HttpStatus.ACCEPTED).body(memberDTO);
  }
}
