package com.example.Dosify.model;

import com.example.Dosify.Enum.Gender;
import com.example.Dosify.Enum.VaccinationStatus;
import com.example.Dosify.Enum.VaccineType;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
@Entity
@Table(name = "Dose1_Certificate")
public class Dose1_Certificate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Column(name = "Vaccination Status")
    @Enumerated(EnumType.STRING)
    VaccinationStatus vaccinationStatus;

    @Column(name = "Gender")
    @Enumerated(EnumType.STRING)
    Gender gender;

    @Column(name = "Beneficiary Name")
    String beneficiaryName;

    @Column(name = "Age")
    int age;

    @Column(name = "Email Id")
    String emailId;

    /*Random number*/
    @Column(name = "Beneficiary Id")
    String beneficiaryRefId;

    @Column(name = "Vaccine Name")
    @Enumerated(EnumType.STRING)
    VaccineType vaccineType;

    @Column(name = "Date of 1st Dose")
    Date dateOfFirstDose;

    @Column(name = "Vaccinated By")
    String doctorName;

    @Column(name = "Vaccinated At")
    String centerName;

    /*Now Established the Parent-child relationship*/
    @OneToOne
    @JoinColumn
    User user;
}
