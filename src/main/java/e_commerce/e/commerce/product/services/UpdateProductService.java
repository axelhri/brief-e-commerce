package e_commerce.e.commerce.product.services;

import e_commerce.e.commerce.product.dto.ProductDTO;
import e_commerce.e.commerce.product.interfaces.UpdateServiceInterface;
import e_commerce.e.commerce.product.model.Product;
import e_commerce.e.commerce.product.repository.ProductRepository;
import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.UUID;

@Service
public class UpdateProductService implements UpdateServiceInterface {
    private final ProductRepository productRepository;

    @Autowired
    public UpdateProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    @Transactional
    public void updateProduct(UUID productId, ProductDTO dto) {
        Product product = productRepository.findById(productId).orElseThrow(() -> new EntityNotFoundException("Product not found: " + productId));

        if (dto.getName() != null && !dto.getName().isBlank() && !Objects.equals(product.getName(), dto.getName())) {
            product.setName(dto.getName());
        }

        if (dto.getPrice() != null && !dto.getPrice().describeConstable().isEmpty() && !Objects.equals(product.getPrice(), dto.getPrice())) {
            product.setPrice(dto.getPrice());
        }

        if (dto.getRating() != null && !dto.getRating().describeConstable().isEmpty() && !Objects.equals(product.getRating(), dto.getRating())) {
            product.setRating(dto.getRating());
        }
    }
}
