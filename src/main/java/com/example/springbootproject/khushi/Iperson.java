package com.example.springbootproject.khushi;

public interface Iperson {
    class Area{

    }
    public String getName();
    public int getAge();

    default int agecalci(){
        return 15;
    }
    static int getnum(){return 10000;}

}
