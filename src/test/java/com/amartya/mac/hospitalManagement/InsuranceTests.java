package com.amartya.mac.hospitalManagement;

import com.amartya.mac.hospitalManagement.entity.Insurance;
import com.amartya.mac.hospitalManagement.entity.Patient;
import com.amartya.mac.hospitalManagement.service.InsuranceService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

@SpringBootTest
public class InsuranceTests {
    @Autowired
    private InsuranceService insuranceService;
    @Test
    public void testInsurance(){
        Insurance insurance = Insurance.builder()
                .policyNumber("HDCF_1234")
                .provider("HDFC")
                .validUntil(LocalDate.of(2030,12,12) )
                .build();
        Patient patient = insuranceService.assignInsuranceToPatient(insurance,1L);
        System.out.println(patient);
    }
}
