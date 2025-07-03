package e_commerce.e.commerce.product.interfaces;

import e_commerce.e.commerce.product.model.Product;

import java.util.UUID;

public interface GetProductServiceInterface {
    Product getProduct(UUID productId);
}
