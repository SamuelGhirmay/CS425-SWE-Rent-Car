package edu.miu.cs425swerentcar.service.impl;

import edu.miu.cs425swerentcar.dto.DiscountRequest;
import edu.miu.cs425swerentcar.entity.Discount;
import edu.miu.cs425swerentcar.repository.DiscountRepository;
import edu.miu.cs425swerentcar.service.DiscountService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiscountServiceImpl implements DiscountService {

    private DiscountRepository discountRepository;

    public DiscountServiceImpl(DiscountRepository discountRepository) {
        this.discountRepository = discountRepository;
    }

    @Override
    public List<Discount> getAllDiscounts() {
        return discountRepository.findAll();
    }

    @Override
    public Discount createNewDiscount(Discount discount) {
        return discountRepository.save(discount);
    }

    @Override
    public Discount updateDiscountById(DiscountRequest discount, Long discountId) {
        Discount updatedDiscount = Discount.build(discountId, discount.getAmount(),discount.getCurrency(),discount.getDescription(),discount.getTitle());
        return updatedDiscount;
    }

    @Override
    public void deleteDiscountById(Long discountId) {
        discountRepository.deleteById(discountId);

    }
}
