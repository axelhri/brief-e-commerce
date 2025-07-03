package e_commerce.e.commerce.product.services;

import e_commerce.e.commerce.product.dto.ProductDTO;
import e_commerce.e.commerce.product.interfaces.CreateServiceInterface;
import e_commerce.e.commerce.product.mapper.ProductMapper;
import e_commerce.e.commerce.product.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateProductService implements CreateServiceInterface {
    private final ProductRepository productRepository;
    private final ProductMapper productMapper;

    @Autowired
    public CreateProductService(ProductRepository productRepository, ProductMapper productMapper) {
        this.productRepository = productRepository;
        this.productMapper = productMapper;
    }

    @Override
    public void createProduct(ProductDTO productDTO) {
        productRepository.save(productMapper.toEntity(productDTO));
    }
}
