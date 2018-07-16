package com.backslashn.initial.repository;

import com.backslashn.initial.model.Customer;

import java.util.List;

/**
 * Created by andrei on 7/15/2018.
 */
public interface CustomerRepository {

    public List<Customer> findAll();
}
