package com.sha.springbootproduct.repository.projection;

import java.time.LocalDateTime;

public interface PurchaseItem {
    String getName();
    Double getPRice();
    LocalDateTime getPurchaseTime();
}
