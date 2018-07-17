package com.backslashn.initial;

import com.backslashn.initial.repository.CustomerRepository;
import com.backslashn.initial.repository.HibernateCustomerRepositoryImpl;
import com.backslashn.initial.service.CustomerService;
import com.backslashn.initial.service.CustomerServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(name = "customerRepository")
    CustomerRepository getCustomerRepository(){
        return new HibernateCustomerRepositoryImpl();
    }

    @Bean(name = "customerService")
    CustomerService getCustomerService(){
        //constructor injection
        CustomerServiceImpl customerService =  new CustomerServiceImpl(getCustomerRepository());
        return  customerService;
    }
}
