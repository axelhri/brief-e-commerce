package e_commerce.e.commerce.product.services;

import e_commerce.e.commerce.product.interfaces.DeleteServiceInterface;
import e_commerce.e.commerce.product.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class DeleteProductService implements DeleteServiceInterface {
    private final ProductRepository productRepository;

    @Autowired
    public DeleteProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public void deleteProduct(UUID productId) {
        productRepository.deleteById(productId);
    }
}
