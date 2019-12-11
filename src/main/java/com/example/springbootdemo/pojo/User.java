package com.example.springbootdemo.pojo;

import org.apache.ibatis.type.Alias;

import java.util.List;

@Alias(value="user")
public class User {
    private Long id = null;
    private String name = null;
    private Integer age = null;
    private List<Choice> choiceList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public List<Choice> getChoiceList() {
        return choiceList;
    }

    public void setChoiceList(List<Choice> choiceList) {
        this.choiceList = choiceList;
    }
}
