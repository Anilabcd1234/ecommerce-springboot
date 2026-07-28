package com.ecommerce3.controller;

import com.ecommerce3.model.Cart;
import com.ecommerce3.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cart")
public class CartController {

    @Autowired
    private CartRepository cartRepository;

    @PostMapping
    public Cart addToCart(@RequestBody Cart cart) {
        return cartRepository.save(cart);
    }

    @GetMapping
    public List<Cart> getAllCarts() {
        return cartRepository.findAll();
    }
}