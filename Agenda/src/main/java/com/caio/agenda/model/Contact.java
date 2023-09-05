package com.caio.agenda.model;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "contacts")
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, name = "first_name")
    private String name;

    @Column(nullable = false, name = "last_name")
    private String surname;

    private String nickname;

    public String getFullName(){
        return name + " " + surname;
    }

}
