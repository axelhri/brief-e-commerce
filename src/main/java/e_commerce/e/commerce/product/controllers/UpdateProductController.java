package e_commerce.e.commerce.product.controllers;

import e_commerce.e.commerce.product.dto.ProductDTO;
import e_commerce.e.commerce.product.services.UpdateProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping(path = "api/v1/product")
public class UpdateProductController {

    private final UpdateProductService updateProductService;

    @Autowired
    public UpdateProductController(UpdateProductService updateProductService) {
        this.updateProductService = updateProductService;
    }

    @PutMapping(path = "{productId}")
    public ResponseEntity<String> updateProduct(@PathVariable UUID productId, @RequestBody ProductDTO productDTO) {
        updateProductService.updateProduct(productId, productDTO);
        return ResponseEntity.status(HttpStatus.OK).body("Product updated successfully");
    }
}
