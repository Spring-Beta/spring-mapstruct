package com.example.springmapstruct.populate;

import com.example.springmapstruct.dto.CustomerChangeDto;
import com.example.springmapstruct.dto.CustomerDto;
import com.example.springmapstruct.model.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CustomerMapper {
    CustomerDto populateCustomer(Customer customer);

    @Mapping(target = "fullName", source = "customer.name")
    @Mapping(target = "customerId", source = "customer.id")
    CustomerChangeDto populateChangeCustomer(Customer customer);
}
