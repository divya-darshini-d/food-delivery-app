package com.example.Payment.Service;

import com.example.Payment.Model.Cart;
import com.example.Payment.Repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartService {

    @Autowired
    private CartRepository cartRepository;

    public List<Cart> getAllCartItems() {
        return cartRepository.findAll();
    }

    public Cart getCartItemById(int id) {
        return cartRepository.findById(id).orElse(null);
    }

    public void addCartItem(Cart cart) {
        Cart existingCartItem = cartRepository.findById(cart.getItem_Id()).orElse(null);
        if (existingCartItem != null) {
            existingCartItem.setQuantity(existingCartItem.getQuantity() + 1);
            existingCartItem.setTotal(existingCartItem.getQuantity() * existingCartItem.getPrice());
            cartRepository.save(existingCartItem);
        } else {
            cartRepository.save(cart);
        }
    }


    public void updateCartItem(Cart cart) {
        cartRepository.save(cart);
    }

    public void deleteCartItemById(int id) {
        cartRepository.deleteById(id);
    }


    public void clearCart() {
        cartRepository.deleteAll();
    }
}