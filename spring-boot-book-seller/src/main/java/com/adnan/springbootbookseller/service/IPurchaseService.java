package com.adnan.springbootbookseller.service;

import com.adnan.springbootbookseller.models.Purchase;
import com.adnan.springbootbookseller.repository.IPurchaseRepository;
import com.adnan.springbootbookseller.repository.projection.IPurchaseItem;

import java.util.List;

/**
 * @author Dell Latitude 5420
 * IFRAH soumia
 **/
public interface IPurchaseService {

    Purchase savePurchase(Purchase purchase);

    List<IPurchaseItem> findPurchaseOfUser(Long userId);
}
