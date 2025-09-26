package com.amartya.mac.hospitalManagement.service;

import com.amartya.mac.hospitalManagement.entity.Insurance;
import com.amartya.mac.hospitalManagement.entity.Patient;
import com.amartya.mac.hospitalManagement.repository.InsuranceRepository;
import com.amartya.mac.hospitalManagement.repository.PatientRepository;
import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class InsuranceService {
    private final InsuranceRepository insuranceRepository;
    private final PatientRepository patientRepository;

    @Transactional
    public Patient assignInsuranceToPatient(Insurance insurance, Long patientId){
        Patient patient = patientRepository.findById(patientId).orElseThrow(() ->
                                            new EntityNotFoundException("Patient not found" + patientId));
        patient.setInsurance(insurance);
        insurance.setPatient(patient); //bidirectional consistency
        return  patient;
    }

}
