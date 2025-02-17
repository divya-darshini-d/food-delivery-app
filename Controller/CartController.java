package com.example.Payment.Controller;

import com.example.Payment.Model.Cart;
import com.example.Payment.Service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cart")
@CrossOrigin(origins = "http://localhost:5173")  // Allow requests from the frontend
public class CartController {

    @Autowired
    private CartService cartService;

    @GetMapping
    public List<Cart> getAllCartItems() {
        return cartService.getAllCartItems();
    }

    @GetMapping("/{id}")
    public Cart getCartItemById(@PathVariable("id") int id) {
        return cartService.getCartItemById(id);
    }

    @PostMapping
    public String addCartItem(@RequestBody Cart cart) {
        cartService.addCartItem(cart);
        return "Item added to cart successfully";
    }

    @PutMapping
    public String updateCartItem(@RequestBody Cart cart) {
        cartService.updateCartItem(cart);
        return "Cart item updated successfully";
    }

    @DeleteMapping("/{id}")
    public String deleteCartItem(@PathVariable("id") int id) {
        cartService.deleteCartItemById(id);
        return "Cart item deleted successfully";
    }


    @DeleteMapping("/clear")
    public String clearCart() {
        cartService.clearCart();
        return "All cart items cleared";
    }
}
