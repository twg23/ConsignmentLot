package com.exampl.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Address {
    @Id
    @GeneratedValue
    private  int id;
    private String lineOne;
    private String lineTwo;
    private String city;
    private String postalCode;
    private String country;
}
