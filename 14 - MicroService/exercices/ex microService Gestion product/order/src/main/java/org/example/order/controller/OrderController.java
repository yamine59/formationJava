package org.example.order.controller;

import org.example.order.dto.OrderRecieveDto;
import org.example.order.entity.Order;
import org.example.order.service.OrderService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/order")
public class OrderController {
    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping
    public List<Order> getOrders(){
        return orderService.get();
    }

    @GetMapping("/{id}")
    public Order getOrder(int id){
        return orderService.get(id);
    }

    @PostMapping
    public Order saveOrder(@RequestBody OrderRecieveDto order){
        return orderService.save(order);
    }

    @PutMapping("/{id}")
    public Order updateOrder(@PathVariable int id,@RequestBody OrderRecieveDto order){
        return orderService.Update(id,order);
    }

    @DeleteMapping("/{id}")
    public void deleteOrder(@PathVariable int id){
        orderService.delete(id);
    }
}
