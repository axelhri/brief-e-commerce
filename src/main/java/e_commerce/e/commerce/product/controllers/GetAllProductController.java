package e_commerce.e.commerce.product.controllers;

import e_commerce.e.commerce.product.dto.ProductDTO;
import e_commerce.e.commerce.product.services.GetAllProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/product")
public class GetAllProductController {

    private final GetAllProductService getAllProductService;

    @Autowired
    public  GetAllProductController(GetAllProductService getAllProductService) {
        this.getAllProductService = getAllProductService;
    }

    @GetMapping
    public List<ProductDTO> getAllProduct() {
        return getAllProductService.getAllProduct();
    }
}
