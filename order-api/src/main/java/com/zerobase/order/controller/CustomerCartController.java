package com.zerobase.order.controller;

import com.zerobase.domain.config.JwtAuthenticationProvider;
import com.zerobase.order.application.CartApplication;
import com.zerobase.order.domain.product.AddProductCartForm;
import com.zerobase.order.domain.redis.Cart;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer/cart")
@RequiredArgsConstructor
public class CustomerCartController {

    private final CartApplication cartApplication;
    private final JwtAuthenticationProvider jwtAuthenticationProvider;

    @PostMapping
    public ResponseEntity<Cart> addCart(@RequestHeader(name = "X-AUTH-TOKEN") String token,
                                        @RequestBody AddProductCartForm form) {
        return ResponseEntity.ok(cartApplication.addCart(jwtAuthenticationProvider.getUserVo(token).getId(), form));
    }

}
