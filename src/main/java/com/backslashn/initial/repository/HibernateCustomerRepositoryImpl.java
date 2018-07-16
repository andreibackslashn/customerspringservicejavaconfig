package com.backslashn.initial.repository;

import com.backslashn.initial.model.Customer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by andrei on 7/15/2018.
 */
public class HibernateCustomerRepositoryImpl implements CustomerRepository {

    @Override
    public List<Customer> findAll() {
        List<Customer> customerList = new ArrayList();
        Customer customerTest1 = new Customer();
        customerTest1.setFirstName("John");
        customerTest1.setLastNanme("Doe");
        Customer customerTest2 = new Customer();
        customerTest2.setFirstName("Jane");
        customerTest2.setLastNanme("Doe");
        customerList.add(customerTest1);
        customerList.add(customerTest2);

        return customerList;
    }
}
