package e_commerce.e.commerce.product.interfaces;

import e_commerce.e.commerce.product.dto.ProductDTO;

import java.util.UUID;

public interface UpdateServiceInterface {
    void updateProduct(UUID productId, ProductDTO productDTO);
}
