package com.gtmc.archetypes.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 12345
 */
@RestController
public class TestController {

  @GetMapping("/")
  public String test() {
    System.out.println(1111);
    System.err.println(2222);
    return "Hello World12345";
  }

  public void sayHi() {
    System.err.println(1 / 0);
    System.err.println(1234567);
    String aa = "余浩";
    String key = "余浩";
    if (key.equals(aa)) {
      System.err.println("12321jjj斤斤计较");
    }
  }

}
