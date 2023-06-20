package com.hjwasim.userapi.dtos;

import com.hjwasim.userapi.entity.User;
import lombok.Data;

import java.util.Date;

@Data
public class UserDTO {
    private String name;
    private String address;
    private String pan;
    private String email;
    private String mobile;
    private Date registeredDate;

    public static UserDTO convert(User user) {
        UserDTO userDto = new UserDTO();
        userDto.setName(user.getName());
        userDto.setAddress(user.getAddress());
        userDto.setPan(user.getPan());
        userDto.setEmail(user.getEmail());
        userDto.setMobile(user.getMobile());
        userDto.setRegisteredDate(user.getRegisteredDate());
        return userDto;
    }
}
