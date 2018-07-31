package com.backslashn.initial;

import com.backslashn.initial.repository.CustomerRepository;
import com.backslashn.initial.repository.HibernateCustomerRepositoryImpl;
import com.backslashn.initial.service.CustomerService;
import com.backslashn.initial.service.CustomerServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//scan the packages for components(component) or stereotype annotations(service,repository)
@ComponentScan({"com.backslashn.initial"})
public class AppConfig {

// No need to explicitly declare beans

/*    @Bean(name = "customerRepository")
    CustomerRepository getCustomerRepository(){
        return new HibernateCustomerRepositoryImpl();
    }

    @Bean(name = "customerService")
    CustomerService getCustomerService(){
        CustomerServiceImpl customerService =  new CustomerServiceImpl();
        customerService.setCustomerRepository(getCustomerRepository());
        return  customerService;
    }*/
}
