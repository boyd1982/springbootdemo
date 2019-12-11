package com.example.springbootdemo.pojo;

import org.apache.ibatis.type.Alias;

@Alias(value = "choice")
public class Choice {
    private Integer id=null;
    private String choice=null;

    public String getChoice() {
        return choice;
    }

    public void setChoice(String choice) {
        this.choice = choice;
    }
}
