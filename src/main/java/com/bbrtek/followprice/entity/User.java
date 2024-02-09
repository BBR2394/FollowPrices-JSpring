package com.bbrtek.followprice.entity;

import java.util.Objects;


public class User {
    private Integer id;
    private String lastname;
    private String fisrtname;

    public int initTest() {
        this.fisrtname = "Firstname Test";
        this.lastname = "Firstname Test";
        this.id = 42;
        return 0;
    }

}
