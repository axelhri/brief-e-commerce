package e_commerce.e.commerce.product.interfaces;

import e_commerce.e.commerce.product.dto.ProductDTO;

import java.util.List;

public interface GetAllProductServiceInterface {
    List<ProductDTO> getProducts();
}
