package com.example.springbootproject.khushi;



class TestNestedInterface1 implements Ishowable.Message{
    public void msg(){
        System.out.println("Hello nested interface");
    }

    public static void main(String args[]){
        Ishowable.Message message=new TestNestedInterface1();//upcasting here
        message.msg();
        System.out.println(Ishowable.a);
    }
}
