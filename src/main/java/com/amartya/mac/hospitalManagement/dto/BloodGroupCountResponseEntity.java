package com.amartya.mac.hospitalManagement.dto;

import com.amartya.mac.hospitalManagement.entity.type.BloodGroup;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class BloodGroupCountResponseEntity {

    private BloodGroup bloodGroup;
    private Long count;
}
