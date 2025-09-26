package com.amartya.mac.hospitalManagement.repository;

import com.amartya.mac.hospitalManagement.entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {
}