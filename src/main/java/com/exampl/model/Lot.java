package com.exampl.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Lot {
    @Id
    @GeneratedValue
    private  int id;
    private String vehicleEntryDate;
    private String vehicleSoldDate;
}
