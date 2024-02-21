package org.signify;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        User u1 = (User) context.getBean("User");

        User u2 = (User) context.getBean("User");
        u2.setUserName("Kisan");
        System.out.println("User name: "+u1.getUserName());
        System.out.println("User name: "+u2.getUserName());
        u2.setEmailId("kisan.signify@gmail.com");
        System.out.println("Email Id: "+u1.getEmailId());
        System.out.println("Email Id: "+u2.getEmailId());
        u2.setPhoneNumber("0987654321");
        System.out.println("Phone Number: "+u1.getPhoneNumber());
        System.out.println("Phone Number: "+u2.getPhoneNumber());

    }
}