package com.example.demo.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/del-api")
public class DeleteController {

  // http://localhost:8080/api/v1/del-api/val/{String 값}
  @DeleteMapping(value = "/delete/{value}")
  public String DeleteVariable(@PathVariable String value) {
    return value;
  }
}
