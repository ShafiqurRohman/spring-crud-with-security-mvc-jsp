package com.springbootmvc.springcrudwithsecuritymvcjsp.extensions.mappers;

import com.springbootmvc.springcrudwithsecuritymvcjsp.entities.UserInfo;
import com.springbootmvc.springcrudwithsecuritymvcjsp.extensions.dtos.UserInfoDto;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class AutoMapper {
    public static UserInfoDto mapToUserDTO(UserInfo userInfo){
        UserInfoDto userDto = UserInfoDto.builder()
                .id(userInfo.getId())
                .userName(userInfo.getUserName())
                .email(userInfo.getEmail())
                .fullName(userInfo.getFullName())
                .country(userInfo.getCountry())
                .createdOn(userInfo.getCreatedOn())
                .updatedOn(userInfo.getUpdatedOn())
                .build();
        return userDto;
    }
    public static UserInfo mapToUser(UserInfoDto userInfoDto) {
        UserInfo userInfo = UserInfo.builder()
                .id(userInfoDto.getId())
                .userName(userInfoDto.getUserName())
                .email(userInfoDto.getEmail())
                .fullName(userInfoDto.getFullName())
                .password(userInfoDto.getPassword())
                .country(userInfoDto.getCountry())
                .createdOn(userInfoDto.getCreatedOn())
                .updatedOn(LocalDateTime.ofInstant(Instant.now(), ZoneId.of("UTC")))
                .build();
        return  userInfo;
    }
}
