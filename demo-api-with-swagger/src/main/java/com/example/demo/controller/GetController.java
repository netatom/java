package com.example.demo.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.MemberDTO;

@RestController
@RequestMapping("/api/v1/get-api")
public class GetController {

  // http://localhost:8080/api/v1/get-api/hello
  @RequestMapping(value = "/hello", method = RequestMethod.GET)
  public String getHello() {
    return "Hello World!";
  }

  // http://localhost:8080/api/v1/get-api/name
  @GetMapping(value = "/name")
  public String getName() {
    return "My Name";
  }

  // http://localhost:8080/api/v1/get-api/value{String 값}
  @GetMapping(value = "/value/{value}")
  public String getVariable1(@PathVariable String value) {
    return value;
  }

  // http://localhost:8080/api/v1/get-api/request1?name=teter&email=test@test.com&organization=qwer
  @GetMapping(value = "/request1")
  public String getRequestParam1(
      @RequestParam String name, @RequestParam String email, @RequestParam String organization) {
    return name + " " + email + " " + organization;
  }

  // http://localhost:8080/api/v1/get-api/request2?key1=value1&key2=value2
  @GetMapping(value = "/request2")
  public String getRequestParam2(@RequestParam Map<String, String> param) {
    StringBuilder sb = new StringBuilder();

    param
        .entrySet()
        .forEach(
            map -> {
              sb.append(map.getKey() + " : " + map.getValue() + "\n");
            });

    return sb.toString();
  }

  // http://localhost:8080/api/v1/get-api/request3?name=teter&email=test@test.com&organization=qwer
  @GetMapping(value = "/request3")
  public String getRequestParam3(MemberDTO memberDTO) {
     return memberDTO.getName() + " " + memberDTO.getEmail() + " " + memberDTO.getOrganization();
  }
}
