package com.example.uberprojectentityservice.models;

import jakarta.persistence.Entity;
import lombok.*;

import java.util.Random;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OTP extends BaseModel {

    private String code;

    private String sentToNumber;

    public  static OTP  make(String phoneNumber){
        Random random = new Random();
        int code = random.nextInt(9000) + 1000;
        return OTP.builder().code(Integer.toString(code)).build();
    }
}
