package com.example.database.models;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
@Data
@NoArgsConstructor
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String name;
    private String phoneNumber;

    @OneToMany(fetch=FetchType.EAGER, mappedBy = "client")
    private List<Orders> orders;
}
