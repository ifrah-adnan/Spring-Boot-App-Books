package com.adnan.springbootbookseller.repository.projection;

import java.time.LocalDateTime;

/**
 * @author Dell Latitude 5420
 * IFRAH soumia
 **/
public interface IPurchaseItem {
    String getTitle();
    Double getPrice();
    LocalDateTime getPurchaseTime();
}
