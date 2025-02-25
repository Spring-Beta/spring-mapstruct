package com.example.springmapstruct.dto;

public record OrderDto(
        Long orderNumber,
        String orderDetails,
        String itemName
) {
}
