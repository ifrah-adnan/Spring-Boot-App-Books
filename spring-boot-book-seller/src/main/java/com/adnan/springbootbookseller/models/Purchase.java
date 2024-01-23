package com.adnan.springbootbookseller.models;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author Dell Latitude 5420
 * IFRAH soumia
 **/
@Data
@Entity
@Table(name = "Purchase")
public class Purchase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "user id", nullable = false)
    private Long userId;

    @Column(name = "book id " ,nullable = false)
    private Long bookId;
    @Column(name = "price", nullable = false)

    private Double price;
    @Column(name = "purchase time", nullable = false)

    private LocalDateTime purchaseTime;



}
