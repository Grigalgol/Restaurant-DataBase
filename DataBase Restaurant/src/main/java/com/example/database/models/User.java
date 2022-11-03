package com.example.database.models;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;
import java.util.List;

@Entity
@Table(name = "users", uniqueConstraints = @UniqueConstraint(columnNames = "phoneNumber"))
@Data
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String name;
    private String phoneNumber;
    private String password;

    public User(String name, String phoneNumber, String password, Role role) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.password = password;
        this.role = role;
    }

    @Enumerated(value = EnumType.STRING)
    @Column(name = "role")
    private Role role;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "user")
    private List<Orders> orders;
}
