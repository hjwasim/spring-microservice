package com.hjwasim.userapi.entity;

import com.hjwasim.userapi.dtos.UserDTO;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.Date;

@Data
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String pan;
    private String address;
    private String email;
    private String mobile;
    private Date registeredDate;

    public static User convert(UserDTO userDTO) {
        User user = new User();
        user.setName(userDTO.getName());
        user.setPan(userDTO.getPan());
        user.setAddress(userDTO.getAddress());
        user.setEmail(userDTO.getEmail());
        user.setMobile(userDTO.getMobile());
        user.setRegisteredDate(userDTO.getRegisteredDate());
        return user;
    }

}
