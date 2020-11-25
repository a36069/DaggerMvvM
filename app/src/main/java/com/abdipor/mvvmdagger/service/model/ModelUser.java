package com.abdipor.mvvmdagger.service.model;

import com.abdipor.mvvmdagger.view.annotation.Pass;
import com.abdipor.mvvmdagger.view.annotation.User;

import javax.inject.Inject;

public class ModelUser {
    private String name,pass;

  @Inject
    public ModelUser(@User String user, @Pass String pass) {
        this.name = user;
        this.pass = pass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}
