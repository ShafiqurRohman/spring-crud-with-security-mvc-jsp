package com.springbootmvc.springcrudwithsecuritymvcjsp.extensions.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserInfoDto {
    private long id;
    private String userName;
    private String email;
    private String fullName;
    private String password;
    private String country;
    private LocalDateTime createdOn;
    private LocalDateTime updatedOn;
}
