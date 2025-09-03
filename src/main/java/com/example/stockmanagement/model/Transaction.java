package com.example.stockmanagement.model;

import jakarta.persistence.*;


import java.time.LocalDateTime;

@Entity
@Table(name = "tbl_transaction")
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "transaction_id")
    private Long id;
    @Column(name = "tran_qty")
    private int quantity;
    @Enumerated(EnumType.STRING)
    private TransactionType type;
    @ManyToOne
    @JoinColumn(name = "product_id", nullable = false)
    private Product product;
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private Users user;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public enum TransactionType {
        INBOUND, OUTBOUND
    }
}
