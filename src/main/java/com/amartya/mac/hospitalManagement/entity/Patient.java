package com.amartya.mac.hospitalManagement.entity;

import com.amartya.mac.hospitalManagement.entity.type.BloodGroup;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Table(uniqueConstraints = @UniqueConstraint(name = "unique_name_birtDate", columnNames = {"name", "birthDate"}))
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     Long id;

    @Column(length = 50, nullable = false)
     String name;

    LocalDate birthDate;
    private String email;
    private String gender;

    @Enumerated(EnumType.STRING)
    private BloodGroup bloodGroup;

    @CreationTimestamp
    @Column(updatable = false)
    private LocalDateTime createdAt;
}
