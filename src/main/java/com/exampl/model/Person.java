package com.exampl.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Entity
@Data
@Slf4j
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    @Id
    @GeneratedValue
    private  int id;
    private String name;
    @OneToOne(cascade = CascadeType.PERSIST)
    private Address address;
    private String phoneNumber;
    private  String emailAddress;
}
