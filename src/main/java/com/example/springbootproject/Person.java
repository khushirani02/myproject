package com.example.springbootproject;


import com.example.springbootproject.khushi.APerson;
import com.example.springbootproject.khushi.Iperson;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import lombok.extern.flogger.Flogger;



@Setter
@Getter
public class Person extends APerson implements Iperson{

    public static  String godName="insan";
    public static int a=10;
      private String name;

     private int id;

     private Address address;

    public  int getrank(){
          return 1;
      }

     public void getout(){
         System.out.println("printing from person");
     }

     public Person(String name, int id){
         this.name=name;
         this.id=id;
     }

     public  static int getSum(int a,int b){
         return a+b;
     }
     static {
         System.out.println("class loaded");
         godName="changed insan";
     }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
  public int agecalci(){
         return 10;
  };

    public int getAge() {
        return 0;
    }

    @Getter
     class Address{
         String cityName;

         public Address(String cityName){
             this.cityName=cityName;

         }
     }

     }
