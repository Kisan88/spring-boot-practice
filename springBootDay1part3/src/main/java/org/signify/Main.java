package org.signify;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
        User u1 = (User) context.getBean("user");
        System.out.println("User name: "+u1.getUserName());
        System.out.println("Email Id: "+u1.getEmailId());
        System.out.println("Phone Number: "+u1.getPhoneNumber());




    }
}