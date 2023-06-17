package com.sha.springbootproduct.service;

import com.sha.springbootproduct.model.Purchase;
import com.sha.springbootproduct.repository.projection.PurchaseItem;

import java.util.List;

public interface PurchaseService {
    Purchase savePurchase(Purchase purchase);

    List<PurchaseItem> findPurchaseItemsOfUser(Long userId);
}
