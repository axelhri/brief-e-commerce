package e_commerce.e.commerce.product.controllers;

import e_commerce.e.commerce.product.dto.ProductDTO;
import e_commerce.e.commerce.product.services.CreateProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/product")
public class CreateProductController {

    private final CreateProductService createProductService;

    @Autowired
    public CreateProductController(CreateProductService createProductService) {
        this.createProductService = createProductService;
    }

    @PostMapping
    public ResponseEntity<String> createNewStudent(@RequestBody ProductDTO productDTO) {
        createProductService.createProduct(productDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body("Product created successfully");
    }
}
