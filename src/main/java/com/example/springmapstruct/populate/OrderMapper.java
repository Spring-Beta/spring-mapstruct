package com.example.springmapstruct.populate;

import com.example.springmapstruct.dto.OrderDto;
import com.example.springmapstruct.model.Order;
import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public abstract class OrderMapper {
    @AfterMapping
    protected void modifyName(@MappingTarget OrderDto orderDto){
        var id = orderDto.orderNumber();
        var details = orderDto.orderDetails();
        var itemName = orderDto.itemName().toUpperCase();

        orderDto = new OrderDto(id, details, itemName);
    }


    @Mapping(target = "orderNumber", source = "order.id")
    @Mapping(target = "orderDetails", source = "order.details")
    public abstract OrderDto populateOrder(Order order);
}
