package com.example.springmapstruct.dto;

public record CustomerChangeDto (
        Long customerId,
        String fullName,
        String address
) {}
