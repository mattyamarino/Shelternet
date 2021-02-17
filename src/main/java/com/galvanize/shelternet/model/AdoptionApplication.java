package com.galvanize.shelternet.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@Entity
public class AdoptionApplication {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String address;
    private String phoneNumber;
    private Long animalId;
    private ApplicationStatus status;

    public AdoptionApplication(String name, String address, String phoneNumber, Long animalId) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.animalId = animalId;
        this.status = ApplicationStatus.PENDING;
    }
}
