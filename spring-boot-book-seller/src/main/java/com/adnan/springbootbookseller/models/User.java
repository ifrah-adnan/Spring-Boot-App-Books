package com.adnan.springbootbookseller.models;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author Dell Latitude 5420
 * IFRAH soumia
 **/
@Entity
@Table(name = "users")
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="username",unique=true,nullable = false,length = 100)
    private String username;
    @Column(name="password",nullable = false,length = 100)

    private String password;
    @Column(name="name",nullable = false,length = 100)
    private String name;
    @Column(name="create time",nullable = false)

    private LocalDateTime createTime;
    @Enumerated(EnumType.STRING)
    @Column(name="role",nullable = false)
    private Role role;
}
