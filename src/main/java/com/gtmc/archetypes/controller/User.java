package com.gtmc.archetypes.controller;

import java.util.HashMap;
import java.util.Map;

/**
 * @description：1111
 * @author：Mr.Yu
 * @date：2019/3/27 13:57
 */
public class User {

  private String name;

  private int age;

  /**
   * @description：11
   * @author：Mr.Yu
   * @date：2019/3/27 17:25
   * @param：[]
   * @return：java.lang.String
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  /**
   * @description: 123213
   * @author：Mr.Yu
   * @date：2019/3/28 8:44
   * @param：[args]
   * @return：void
   */
  public static void main(String[] args) {
    User user = new User();
    user.setName("");
    user.setAge(0);
  }

  /**
   * @description：1
   * @author：Mr.Yu
   * @date：2019/3/27 17:25
   * @param：[name, age]
   * @return：java.util.Map
   */
  public Map test111(String name, int age) {
    Map map = new HashMap();
    map.put(name, name);
    map.put(age, age);
    return map;
  }
}
