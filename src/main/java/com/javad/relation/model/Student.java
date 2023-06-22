package com.javad.relation.model;
import lombok.Data;
import javax.persistence.*;
import java.util.Set;

@Data
@Entity
public class Student {
    private String name;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @OneToMany(cascade = CascadeType.ALL)
    private Set<Address> addresses;
}
