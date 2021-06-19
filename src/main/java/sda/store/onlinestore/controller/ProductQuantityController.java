package sda.store.onlinestore.controller;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;
import sda.store.onlinestore.model.ProductQuantity;
import sda.store.onlinestore.model.ProductQuantityDTO;
import sda.store.onlinestore.model.responseBody.ProductQuantityResponse;
import sda.store.onlinestore.service.ProductQuantityService;

import javax.validation.Valid;
import java.time.LocalDate;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
@RequestMapping(value = "/product/quantity")
@AllArgsConstructor
public class ProductQuantityController {

    private final ProductQuantityService productQuantityService;

    @PostMapping
    public ProductQuantity postProductQuantity(@Valid @RequestBody ProductQuantityDTO productQuantityDTO){
        return productQuantityService.postProductQuantity(productQuantityDTO);
    }

    @GetMapping
    public List<ProductQuantity> getAllProductQuantity(){
        return productQuantityService.getAllProductQuantity();
    }

    @GetMapping(value = "/{id}")
    public ProductQuantity getProductQuantityById(@PathVariable String id){
        Long parsedId = Long.parseLong(id);
        return productQuantityService.getProductQuantityById(parsedId);
    }

}
