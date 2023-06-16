package com.javad.relation.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity

public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String email;
    private String password;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id")
    private Address adress;
}
