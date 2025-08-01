package org.example.myapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/")
public class HelloController {

  @GetMapping(path = "/hello")
  public String hello() {
    return "hello, world";
  }

  @GetMapping(path = "/hello2")
  public String hello2(String name) {
    return "안녕하세요 " + name + "님!";
  }
}
