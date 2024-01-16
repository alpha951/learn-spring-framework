package com.flexmoney.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age, Address address) {

};

record Address(String city, String state, String country) {

};

@Configuration
public class HelloWorldConfiguration {
    // Spring Beans
    @Bean
    public String name() {
        return "Bean's Demo";
    }

    @Bean
    public int age() {
        return 21;
    }

    // Method Calling
    @Bean
    public Person person() {
        var person = new Person(name(), age(), address());
        return person;
    }

    // Parameterized Method Calling
    @Bean
    public Person person1(String name, int age, Address address) {
        var person = new Person(name, age, address);
        return person;
    }
    @Bean(name = "myAddress")
    public Address address() {
        return new Address("Bangalore", "Karnataka", "India");
    }
}
