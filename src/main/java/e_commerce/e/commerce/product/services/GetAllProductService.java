package e_commerce.e.commerce.product.services;

import e_commerce.e.commerce.product.dto.ProductDTO;
import e_commerce.e.commerce.product.interfaces.GetAllProductServiceInterface;
import e_commerce.e.commerce.product.mapper.ProductMapper;
import e_commerce.e.commerce.product.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.stream.Collectors;

public class GetAllProductService implements GetAllProductServiceInterface {
    private final ProductRepository productRepository;
    private final ProductMapper productMapper;

    @Autowired
    public GetAllProductService(ProductRepository productRepository, ProductMapper productMapper) {
        this.productRepository = productRepository;
        this.productMapper = productMapper;
    }

    @Override
    public List<ProductDTO> getProducts() {
        return productRepository.findAll().stream().map(productMapper::toDto).collect(Collectors.toList());
    }
}
