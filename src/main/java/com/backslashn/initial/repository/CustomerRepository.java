package com.backslashn.initial.repository;

import com.backslashn.initial.model.Customer;

import java.util.List;

public interface CustomerRepository {

    public List<Customer> findAll();
}
