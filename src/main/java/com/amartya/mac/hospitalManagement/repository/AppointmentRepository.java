package com.amartya.mac.hospitalManagement.repository;

import com.amartya.mac.hospitalManagement.entity.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
}