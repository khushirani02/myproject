package com.example.springbootproject;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Insane {
    private String name;
    private int rollno;
    private int id;
    private int age;

    public Insane(String name, int rollno, int id, int age) {
        this.name=name;
        this.rollno=rollno;
        this.id=id;
        this.age=age;
    }




}
