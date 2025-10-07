package com.amartya.mac.hospitalManagement;

import com.amartya.mac.hospitalManagement.entity.Appointment;
import com.amartya.mac.hospitalManagement.entity.Insurance;
import com.amartya.mac.hospitalManagement.entity.Patient;
import com.amartya.mac.hospitalManagement.repository.AppointmentRepository;
import com.amartya.mac.hospitalManagement.service.AppointmentService;
import com.amartya.mac.hospitalManagement.service.InsuranceService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.time.LocalDateTime;

@SpringBootTest
public class InsuranceTests {
    @Autowired
    private InsuranceService insuranceService;

    @Autowired
    private AppointmentService appointmentService;
    @Test
    public void testInsurance(){
        Insurance insurance = Insurance.builder()
                .policyNumber("HDCF_1234")
                .provider("HDFC")
                .validUntil(LocalDate.of(2030,12,12) )
                .build();
        Patient patient = insuranceService.assignInsuranceToPatient(insurance,1L);
        System.out.println(patient);

        var updatePatient = insuranceService.disaccociateInsuranceFromPatient(patient.getId());

        System.out.println(updatePatient);
    }


    @Test
    public void createAppointment(){
        Appointment appointment = Appointment.builder()
                .appointmentTime(LocalDateTime.of(2025,11,1,9,45))
                .reason("chiku")
                .build();

        var newAppointment = appointmentService.createNewAppointment(appointment, 3L, 2L);

        System.out.println(newAppointment);

        var updatedAppointment = appointmentService.reAssignAppointmentToAnotherDoctor(newAppointment.getId(), 2L);

        System.out.println(updatedAppointment);

    }


    @Test
    public void reAssignAppointmentToAnotherDoctor(){

    }

}
