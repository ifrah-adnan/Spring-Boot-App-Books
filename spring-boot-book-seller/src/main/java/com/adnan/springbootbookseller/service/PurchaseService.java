package com.adnan.springbootbookseller.service;

import com.adnan.springbootbookseller.models.Purchase;
import com.adnan.springbootbookseller.repository.IPurchaseRepository;
import com.adnan.springbootbookseller.repository.projection.IPurchaseItem;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @author Dell Latitude 5420
 * IFRAH soumia
 **/
@Service
public class PurchaseService implements IPurchaseService{
   private final IPurchaseRepository purchaseRepository;

    public PurchaseService(IPurchaseRepository purchaseRepository) {
        this.purchaseRepository = purchaseRepository;
    }
    @Override

    public Purchase savePurchase(Purchase purchase){
        purchase.setPurchaseTime(LocalDateTime.now());
        return purchaseRepository.save(purchase);
    }
    @Override
    public List<IPurchaseItem> findPurchaseOfUser(Long userId){
        return  purchaseRepository.findAllPurchaseOfUser(userId);
    }
}
