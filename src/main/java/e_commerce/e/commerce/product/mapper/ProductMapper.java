package e_commerce.e.commerce.product.mapper;

import e_commerce.e.commerce.product.dto.ProductDTO;
import e_commerce.e.commerce.product.model.Product;
import org.springframework.stereotype.Component;

@Component
public class ProductMapper {

    public ProductDTO toDto(Product product) {
        ProductDTO dto = new ProductDTO();
        dto.setId(product.getId());
        dto.setName(product.getName());
        dto.setPrice(product.getPrice());
        dto.setPrice(product.getRating());
        return dto;
    }

    public Product toEntity(ProductDTO dto) {
        return new Product(dto.getName(), dto.getPrice(), dto.getRating());
    }
}
