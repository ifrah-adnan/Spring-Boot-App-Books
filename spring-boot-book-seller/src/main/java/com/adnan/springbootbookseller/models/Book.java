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
@Table(name = "Book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "title",nullable = false,length = 100)

    private String title;
    @Column(name = "description",nullable = false)
    private String description;

    private Double price;
    @Column(name = "create time",nullable = false)

    private LocalDateTime createTime;

}
