package e_commerce.e.commerce.product.services;

import e_commerce.e.commerce.product.interfaces.GetProductServiceInterface;
import e_commerce.e.commerce.product.model.Product;
import e_commerce.e.commerce.product.repository.ProductRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class GetProductService implements GetProductServiceInterface {
    private final ProductRepository productRepository;

    @Autowired
    public GetProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Product getProduct(UUID productId) {
        return productRepository.findById(productId).orElseThrow(() -> new EntityNotFoundException("Product doesn't exist"));
    }
}
