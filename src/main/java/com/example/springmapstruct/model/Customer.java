package com.example.springmapstruct.model;

//public class Customer {
//    private Long id;
//    private String name;
//    private String address;
//
//    public Customer() {
//    }
//
//    public Customer(Long id, String name, String address) {
//        this.id = id;
//        this.name = name;
//        this.address = address;
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getAddress() {
//        return address;
//    }
//
//    public void setAddress(String address) {
//        this.address = address;
//    }
//}

public record Customer(
        Long id,
        String name,
        String address
) {}


