package com.example.springmapstruct.service;

import com.example.springmapstruct.dto.CustomerChangeDto;
import com.example.springmapstruct.dto.CustomerDto;
import com.example.springmapstruct.model.Customer;
import com.example.springmapstruct.populate.CustomerMapper;

public class CustomerService implements CustomerMapper {
    @Override
    public CustomerDto populateCustomer(Customer customer) {
        return null;
    }

    @Override
    public CustomerChangeDto populateChangeCustomer(Customer customer) {
        return null;
    }
}
