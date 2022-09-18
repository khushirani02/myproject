package com.example.springbootproject.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name="Music")
public class Music {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private int id;
    @Column(name="name")
    private String name;
    @Column(name="userid")
    private int userId;

    public Music(int id,String name,int userId){
        this.id=id;
        this.name=name;
        this.userId=userId;
    }
    public Music(){};


}
