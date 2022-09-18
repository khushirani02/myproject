package com.example.springbootproject;

import com.example.springbootproject.khushi.APerson;
import com.example.springbootproject.khushi.Employee;
import com.example.springbootproject.khushi.Iperson;
import com.example.springbootproject.service.ExceptionHandlingEx;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableAutoConfiguration
@EnableWebMvc
public class SpringbootprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootprojectApplication.class, args);

		ExceptionHandlingEx exceptionHandlingEx = new ExceptionHandlingEx();

		System.out.println(exceptionHandlingEx.getIntegerFromString("num"));
		System.out.println(exceptionHandlingEx.getIntegerFromString("100"));
		System.out.println(Iperson.getnum());
//        APerson ap=new Person("queen",2);
//		System.out.println(ap.increaseMyage(2));

//		Employee e= new Employee("Saurav",25);
//		Person p= new Person("khushi",1);
//		Person p1= new Human("rani",2);
//		p.getout();;
//		p1.getout();


		APerson ap1 = new Person("khushi",1);

//         String s1= "khushi";
//		 String s2= "khushi";
//
//		 String s3= new String("khushi");
//		System.out.println(s1.equals(s2));
//		System.out.println(s1.equals(s3));
//		System.out.println(s1==s2);
//		System.out.println(s1==s3);




		//	System.out.println(e.getName());

	}

}
