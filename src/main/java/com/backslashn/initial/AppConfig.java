package com.backslashn.initial;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//scan the packages for components(component) or stereotype annotations(service,repository)
@ComponentScan({"com.backslashn.initial"})
public class AppConfig {
// No need to explicitly declare beans
/*
    @Bean(name = "customerService")
    CustomerService getCustomerService(){
        CustomerServiceImpl customerService =  new CustomerServiceImpl(getCustomerRepository());
        return customerService;
    }

    @Bean(name = "customerRepository")
    CustomerRepository getCustomerRepository(){
        return new HibernateCustomerRepositoryImpl();
    }
*/

}
