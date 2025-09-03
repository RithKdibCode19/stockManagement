package com.example.stockmanagement.model;


import jakarta.persistence.*;


import java.time.LocalDateTime;


@Entity
@Table(name = "tbl_users")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long id;
    @Column(nullable = false, unique = true)
    private String username;
    @Column(nullable = false)
    private String password;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private UsersRole role;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public enum  UsersRole {
        USER,
        ADMIN
    }
}
