package com.example.week2022_08_01;

import java.io.Serializable;

public class Cat implements Serializable {
    String name="";

    public Cat(String Str){
        this.name=Str;
    }

    public String sayMyName(){


        return "Meyeew " +name;
    }


}
