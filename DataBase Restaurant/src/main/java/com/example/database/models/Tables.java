package com.example.database.models;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
@Data
@NoArgsConstructor
public class Tables {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private Long countPlaces;

    private Long amountBooking;

    @OneToMany(fetch=FetchType.LAZY)
    private List<Order> orders;
}
