package com.example.springbootdemo.pojo;

import org.apache.ibatis.type.Alias;

@Alias(value = "userchoices")
public class UserChoices {
    private Integer iduserchoice;
    private Integer idUserInfo;
    private String choice;

    public String getChoice() {
        return choice;
    }

    public void setChoice(String choice) {
        this.choice = choice;
    }

    public Integer getIdUserInfo() {
        return idUserInfo;
    }

    public void setIdUserInfo(Integer idUserInfo) {
        this.idUserInfo = idUserInfo;
    }
}
