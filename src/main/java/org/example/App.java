package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App
{
    public static void main( String[] args )
    {
        ConfigurableApplicationContext con = SpringApplication.run(org.example.App.class, args);
        ApplicationContext contextXML = new ClassPathXmlApplicationContext("Spring.xml");//spring container
        Phone p = (Phone) contextXML.getBean("Phone");
        System.out.println(p); //setter injection

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("org.example");
        context.refresh();

        Address a = (Address) context.getBean("address");
        System.out.println(a); //xml constructor way

        student s = con.getBean(student.class);
        s.setPh(p); //java config injection
        System.out.println(s);




        /*
        student s = (student) context.getBean("student");
        System.out.println(s);

         */

    }
}
