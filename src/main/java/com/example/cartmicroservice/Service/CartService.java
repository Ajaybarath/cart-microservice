package com.example.cartmicroservice.Service;

import com.example.cartmicroservice.Models.Cart;
import com.example.cartmicroservice.Models.Product;
import com.example.cartmicroservice.Models.ProductData;
import com.example.cartmicroservice.Repository.CartRepository;
import com.example.cartmicroservice.Repository.ProductDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CartService {

    @Autowired
    CartRepository cartRepository;

    @Autowired
    ProductDataRepository productDataRepository;

    public Cart getCartById(int id) {
        return cartRepository.findById(id).get();
    }

    public List<Cart> getAllCart() {
        return cartRepository.findAll();
    }

    public List<ProductData> getListOfProductsInCart(int id) {
        return cartRepository.findById(id).get().getProductDataList();
    }

    public void addProductToCart(int cartId, Product product) {
        for (ProductData productData : cartRepository.findById(cartId).get().getProductDataList()) {
            if (productData.getProductId() == product.getId()) {
                productDataRepository.findById(productData.getId()).map(productData2 -> {
                    productData2.setQuantity(productData2.getQuantity() + 1);
                    return productDataRepository.save(productData2);
                });
            }
            else {
                ProductData productData1 = new ProductData(product.getId(),product.getName(), product.getDescription(), product.getMrp(), product.getDiscount(), 1);
                productDataRepository.save(productData1);
            }
        }
//        cartRepository.findById(id).get()

    }
}
