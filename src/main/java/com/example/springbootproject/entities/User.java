package com.example.springbootproject.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name="User")
public class User {
    @Id   //to create primary key
    @Column(name="id")
    private int id;
    @Column(name="age")
    private int age;
    @Column(name="name")
    private String name;

    public User(int id,int age,String name){

        this.id=id;
        this.age=age;
        this.name=name;
    }
    public User(){

    }
}
