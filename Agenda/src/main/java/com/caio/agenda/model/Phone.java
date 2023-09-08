package com.caio.agenda.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "phones")
@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter @Builder
public class Phone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String ddd;
    private String number;
}
