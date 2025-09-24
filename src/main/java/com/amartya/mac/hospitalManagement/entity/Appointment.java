package com.amartya.mac.hospitalManagement.entity;


import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private LocalDateTime appointmentTime;

    @Column(length = 500)
    private String reason;


    @ManyToOne
    @JoinColumn(name = "patient_id", nullable = false) //owning side
    private Patient patient;

    @ManyToOne
    @JoinColumn( nullable = false)
    private Doctor doctor;
}
