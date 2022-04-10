package ru.kosenko.springshoppattern.controller.rest;

import org.springframework.web.bind.annotation.*;
import ru.kosenko.springshoppattern.dto.Cart;
import ru.kosenko.springshoppattern.service.CartService;

@RestController
@RequestMapping("/cart")
public class CartRestController {

  private CartService cartService;

  public CartRestController(CartService cartService) {
    this.cartService = cartService;
  }

  @GetMapping// GET cart
  public Cart getCart() {
    return cartService.getCartForCurrentUser();
  }

  @PostMapping("/product/{id}") // POST cart/product/1
  public Cart addProduct(@PathVariable Long id) {
    return cartService.addProductById(id);
  }

  @DeleteMapping("/product/{id}") // DELETE cart/product/1
  public Cart deleteProduct(@PathVariable Long id) {
    return cartService.removeProductById(id);
  }
}
