package com.flexmoney.learnspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App1HelloWorld {
    public static void main(String[] args) {
        // Launch a spring context
        var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
        // configure things that  spring will manage - @Configure
        System.out.println(context.getBean("name"));
        var person = context.getBean("person");
        System.out.println(person);
        System.out.println(context.getBean("myAddress"));
        System.out.println(context.getBean("person1"));
    }
}
