package com.fabio.santander_dev_week_2023.domain.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;

@Entity(name = "account_tb")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String number;
    private String agency;
    @Column(precision = 2, scale = 13)
    private BigDecimal balance;
    @Column(name = "account_limit", precision = 14, scale = 2)
    private BigDecimal limit;
}
