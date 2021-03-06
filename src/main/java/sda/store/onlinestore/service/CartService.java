package sda.store.onlinestore.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import sda.store.onlinestore.model.*;
import sda.store.onlinestore.repository.CartRepository;
import sda.store.onlinestore.repository.ProductRepository;
import sda.store.onlinestore.repository.UserRepository;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class CartService {

    private final CartRepository cartRepository;
    private final ProductRepository productRepository;
    private final UserRepository userRepository;

    public Cart addProductToCart(CartDTO cartDTO, Long userId) {
        if (checkIfProductExists(cartDTO, userId)) {
            return null;
        }
        else {
        Cart cart = new Cart();
        Optional<User> userOpt = userRepository.findById(userId);
        User user = userOpt.orElseThrow(() -> new RuntimeException("User was not found"));
        Optional<Product> productOpt = productRepository.findById(cartDTO.getProductId());
        Product product = productOpt.orElseThrow(() -> new RuntimeException("Product was not found"));
            cart.setProduct(product);
            cart.setQuantity(cartDTO.getQuantity());
            cart.setUser(user);
            return cartRepository.save(cart);
        }
    }

    public Cart updateCartProductById(Cart cart) {
        Cart cartProductToUpdate = getCartEntryById(cart.getId());
        cartProductToUpdate.setProduct(cart.getProduct());
            if (checkIfCartIsZeroOrLess(cart)) {
                cartProductToUpdate.setQuantity(0.00);
            } else {
                cartProductToUpdate.setQuantity(cart.getQuantity());
            }
        return cartRepository.save(cartProductToUpdate);
    }

    public boolean checkIfProductExists(CartDTO cartDTO, Long userId) {
        List<Cart> allProductsInCart = getAllCartByUserId(userId);
        for (Cart cart: allProductsInCart) {
            if (cart.getProduct().getId().equals(cartDTO.getProductId())) {
                cart.setQuantity(cart.getQuantity() + 1);
                cartRepository.save(cart);
                return true;
            }
        }
        return false;
    }

    public void deleteCartProductById(Long id) {
        cartRepository.deleteById(id);
    }

    public List<Cart> getAllCartByUserId(Long userId) {
        Optional<User> userOpt = userRepository.findById(userId);
        User user = userOpt.orElseThrow(() -> new RuntimeException("User was not found"));
        return cartRepository.findAllByUser(user);
    }

    public boolean checkIfCartIsZeroOrLess(Cart cart) {
        return cart.getQuantity() <= 0;
    }

    public Cart getCartEntryById(Long cartId) {
        Optional<Cart> cartOpt = cartRepository.findById(cartId);
        return cartOpt.orElseThrow(() -> new RuntimeException("Cart entry was nor found"));
    }

    public Double getTotalPriceByUserId(Long userId) {
        double sum = 0;
        List<Cart> allProducts;
        allProducts = getAllCartByUserId(userId);
        for (Cart cart:
             allProducts) {
           double productSum = cart.getProduct().getPrice() * cart.getQuantity();
           sum += productSum;
        }
        return sum;
    }
}
