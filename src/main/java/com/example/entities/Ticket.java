package com.example.entities;

import com.example.enums.TypeTicket;
import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;


@Builder
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@ToString

public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

   @ManyToOne
   @JoinColumn(name = "event_id")
    private Event event;

    private Double priceTicket;
    private TypeTicket typeTicket;
}
