package com.amartya.mac.hospitalManagement.repository;

import com.amartya.mac.hospitalManagement.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}