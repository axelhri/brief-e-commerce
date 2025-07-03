package e_commerce.e.commerce.product.controllers;

import e_commerce.e.commerce.product.model.Product;
import e_commerce.e.commerce.product.services.GetProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping(path = "api/v1/product")
public class GetProductController {

    private final GetProductService getProductService;

    @Autowired
    public GetProductController(GetProductService getProductService) {
        this.getProductService = getProductService;
    }

    @GetMapping(path = "{productId}")
    public Product getProduct(@PathVariable UUID productId) {
        return getProductService.getProduct(productId);
    }
}
