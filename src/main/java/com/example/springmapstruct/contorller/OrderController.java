package com.example.springmapstruct.contorller;

import com.example.springmapstruct.dto.OrderDto;
import com.example.springmapstruct.model.Order;
import com.example.springmapstruct.populate.OrderMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {
    private final OrderMapper orderMapper;

    public OrderController(OrderMapper orderMapper) {
        this.orderMapper = orderMapper;
    }

    @PostMapping
    public ResponseEntity<OrderDto> populateOrder(@RequestBody Order order){
        return ResponseEntity.ok(orderMapper.populateOrder(order));
    }
}
