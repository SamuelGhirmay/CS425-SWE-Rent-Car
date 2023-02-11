package edu.miu.cs425swerentcar.controller;


import edu.miu.cs425swerentcar.dto.DiscountRequest;
import edu.miu.cs425swerentcar.entity.Discount;
import edu.miu.cs425swerentcar.service.DiscountService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/car-rental/api/v1//discount")
public class DiscountController {

    private DiscountService discountService;

    @Autowired
    public DiscountController(DiscountService discountService) {
        this.discountService = discountService;
    }

    @GetMapping(value = "/list")
    public List<Discount> listAllDiscounts() {
        return discountService.getAllDiscounts();
    }

    @PostMapping(value = "/new")
    public Discount createNewDiscount(@Valid @RequestBody Discount discount) {
        return discountService.createNewDiscount(discount);
    }
    @PutMapping(value = "/update/{discountId}")
    public Discount updateDiscountById(DiscountRequest discountRequest, Long discountId) {
        return discountService.updateDiscountById(discountRequest,discountId);
    }

    @DeleteMapping(value = "/delete")
    public void deleteDiscountById(Long discountId) {
        discountService.deleteDiscountById(discountId);
    }

}
