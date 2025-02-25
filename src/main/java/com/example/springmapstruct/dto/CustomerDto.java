package com.example.springmapstruct.dto;

//public class CustomerDto {
//    private Long id;
//    private String name;
//    private String address;
//
//    public CustomerDto() {
//    }
//
//    public CustomerDto(Long id, String name, String address) {
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

public record CustomerDto(
        Long id,
        String name,
        String address
) {}