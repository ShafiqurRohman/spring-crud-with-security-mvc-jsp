package com.springbootmvc.springcrudwithsecuritymvcjsp.services.interfaces;



import com.springbootmvc.springcrudwithsecuritymvcjsp.entities.UserInfo;
import com.springbootmvc.springcrudwithsecuritymvcjsp.extensions.dtos.UserInfoDto;

import java.util.List;

public interface IUserInfoService {
    List<UserInfoDto> findAllUsers();
    UserInfo saveUser(UserInfoDto UserInfoDto);
    UserInfoDto findUserById(Long userId);
    void updateUser(UserInfoDto userInfoDto);
    void delete(long userId);
}
