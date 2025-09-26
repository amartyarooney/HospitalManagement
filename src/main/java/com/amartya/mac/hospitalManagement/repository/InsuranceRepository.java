package com.amartya.mac.hospitalManagement.repository;

import com.amartya.mac.hospitalManagement.entity.Insurance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InsuranceRepository extends JpaRepository<Insurance, Long> {
}