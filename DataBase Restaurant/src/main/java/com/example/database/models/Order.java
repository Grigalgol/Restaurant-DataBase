package com.example.database.models;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "orders")
@Data
@NoArgsConstructor
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    //@ManyToOne(fetch = FetchType.LAZY)
    //private Client client;

   // @ManyToOne(fetch = FetchType.LAZY)
    //private Waiter waiter;

   // @ManyToOne(fetch = FetchType.LAZY)
   // private Tables table;

   // @ManyToOne(fetch = FetchType.LAZY)
   // private OrderStatus orderStatus;

    //private Date start_date;

    //public Order(Client client, Waiter waiter, Tables table) {
        //this.client = client;
        //this.waiter = waiter;
        //this.table = table;
       // this.orderStatus = orderStatus;
        //this.start_date = start_date;
        //this.menus = menus;
}

//    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
//    @JoinTable(
//            name = "order_menu",
//            joinColumns = @JoinColumn(
//                    name = "order_id", referencedColumnName = "id"),
//            inverseJoinColumns = @JoinColumn(
//                    name = "menu_id", referencedColumnName = "id"))
//    private Collection<Menu> menus;

