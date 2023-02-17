package edu.miu.cs425swerentcar.service;

import edu.miu.cs425swerentcar.dto.DiscountRequest;
import edu.miu.cs425swerentcar.entity.Discount;

import java.util.List;

public interface DiscountService {

    List<Discount> getAllDiscounts();
    Discount createNewDiscount(Discount discount);
    Discount updateDiscountById(DiscountRequest discount, Long discountId);
    Discount getDiscountById(Long discountId);
    void deleteDiscountById(Long discountId);
}
