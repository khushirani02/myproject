package com.example.springbootproject;

public class Human extends Person{

    public Human(String name, int id) {
        super(name, id);

    }

    public void getout(){
        System.out.println("printing from human");
    }

}
