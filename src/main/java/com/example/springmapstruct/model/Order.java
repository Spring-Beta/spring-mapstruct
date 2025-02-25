package com.example.springmapstruct.model;

public record Order(
        Long id,
        String details,
        String itemName
) {}
