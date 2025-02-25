package com.example.springmapstruct.contorller;

import com.example.springmapstruct.dto.CustomerChangeDto;
import com.example.springmapstruct.dto.CustomerDto;
import com.example.springmapstruct.model.Customer;
import com.example.springmapstruct.populate.CustomerMapper;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    private final CustomerMapper customerMapper;

    public CustomerController(CustomerMapper customerMapper) {
        this.customerMapper = customerMapper;
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<CustomerDto> populateCustomer(@RequestBody Customer customer){
        return ResponseEntity.ok(customerMapper.populateCustomer(customer));
    }

    @PostMapping(value = "/change", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<CustomerChangeDto> populateChangeCustomer(@RequestBody Customer customer){
        return ResponseEntity.ok(customerMapper.populateChangeCustomer(customer));
    }
}
