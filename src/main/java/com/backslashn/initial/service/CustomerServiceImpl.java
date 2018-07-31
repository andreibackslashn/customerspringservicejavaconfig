package com.backslashn.initial.service;

import com.backslashn.initial.model.Customer;
import com.backslashn.initial.repository.CustomerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import java.util.List;

@Service("customerService")
//@Scope("prototype") or @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public  class CustomerServiceImpl implements CustomerService {

    CustomerRepository customerRepository;

    public CustomerServiceImpl(){}

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        System.out.println("Using constructor injection");
        this.customerRepository = customerRepository;
    }

    //Setter injection
    @Autowired
    public void setCustomerRepository(CustomerRepository customerRepository) {
        System.out.println("Using setter injection");
        this.customerRepository = customerRepository;
    }

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

}
