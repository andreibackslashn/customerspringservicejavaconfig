package com.backslashn.initial;

import com.backslashn.initial.model.Customer;
import com.backslashn.initial.service.CustomerService;
import com.backslashn.initial.service.CustomerServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Iterator;

public class Application {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

//        CustomerService customerService  = new CustomerServiceImpl();
        CustomerService customerService = applicationContext.getBean("customerService", CustomerService.class);


        System.out.println("---List customers using foreach and getters---");
        for (Customer customer:customerService.findAll()) {
            System.out.println(customer.getFirstName() + " " + customer.getLastNanme());
        }
        System.out.println("---List customers using iterator and toString--- ");
        Iterator<Customer> customerIterator = customerService.findAll().iterator();
        while (customerIterator.hasNext()){
            System.out.println(customerIterator.next().toString());
        }
    }
}