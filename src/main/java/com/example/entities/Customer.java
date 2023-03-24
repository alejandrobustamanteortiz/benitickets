package com.example.entities;

import com.example.enums.Nationality;
import jakarta.persistence.*;
import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@ToString

public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    String firstName;
    String firstLastName;
    String secondLastName;
    String phoneNumber;
    Nationality nationality;

    @Column(unique = true, nullable = false)
    String email;
}
