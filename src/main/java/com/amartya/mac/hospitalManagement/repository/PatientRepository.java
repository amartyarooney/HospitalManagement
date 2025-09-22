package com.amartya.mac.hospitalManagement.repository;


import com.amartya.mac.hospitalManagement.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface PatientRepository extends JpaRepository<Patient, Long> {
    Patient findByName(String name);
//    List<Patient> findByBirthDateOrEmail(LocalDate birthDate, String email);
    List<Patient> findByNameContaining(String string);
}
