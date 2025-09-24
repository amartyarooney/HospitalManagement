package com.amartya.mac.hospitalManagement;

import com.amartya.mac.hospitalManagement.entity.Patient;
import com.amartya.mac.hospitalManagement.repository.PatientRepository;
import com.amartya.mac.hospitalManagement.service.PatientService;
import lombok.ToString;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.List;

@SpringBootTest
public class patientTests {

    @Autowired
    private PatientService patientService;

    @Autowired
    private PatientRepository patientRepository;
    @Test
    public void testPatientRepository(){
        List<Patient> patientList = patientRepository.findAll();
        System.out.println(patientList);
    }
//
//    @Test
//    public void testSavePatient(){
//        LocalDate date = LocalDate.of(1998, 10, 15);
//        Patient p1 = new Patient("Jamru" , date , "asd@gmail.com", "male");
////        private String name;
////
////        @ToString.Exclude
////        private LocalDate birthDate;
////        private String email;
////        private String gender;
//        patientRepository.save(p1);
//
//
//    }

    @Test
    public void testTransactionMethods(){
        Patient patient = patientRepository.findByName("Ishita Verma");
//        List<Patient> patientList = patientRepository.findByBirthDateOrEmail(LocalDate.of(1988, 12, 05), "priya.nair@example.com");
//        List<Patient> patientList = patientRepository.findByNameContaining("ta");

        System.out.println(patient);
//        System.out.println(patientList);
    }
}
