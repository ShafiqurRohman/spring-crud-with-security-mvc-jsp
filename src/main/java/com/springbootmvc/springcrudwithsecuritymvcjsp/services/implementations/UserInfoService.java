package com.springbootmvc.springcrudwithsecuritymvcjsp.services.implementations;


import com.springbootmvc.springcrudwithsecuritymvcjsp.entities.UserInfo;
import com.springbootmvc.springcrudwithsecuritymvcjsp.extensions.dtos.UserInfoDto;
import com.springbootmvc.springcrudwithsecuritymvcjsp.extensions.mappers.AutoMapper;
import com.springbootmvc.springcrudwithsecuritymvcjsp.repositories.interfaces.IUserInfoRepository;
import com.springbootmvc.springcrudwithsecuritymvcjsp.services.interfaces.IUserInfoService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserInfoService implements IUserInfoService {
    private IUserInfoRepository userInfoRepository;

    public UserInfoService(IUserInfoRepository userInfoRepository) {
        this.userInfoRepository = userInfoRepository;
    }

    @Override
    public List<UserInfoDto> findAllUsers() {
        List<UserInfo> Users = userInfoRepository.findAll();
        return Users.stream()
                .map((User) -> AutoMapper.mapToUserDTO(User))
                .collect(Collectors.toList());
    }

    @Override
    public UserInfo saveUser(UserInfoDto userDto) {
        UserInfo user = AutoMapper.mapToUser(userDto);
        return userInfoRepository.save(user);
    }

    @Override
    public UserInfoDto findUserById(Long UserId) {
        UserInfo user = userInfoRepository.findById(UserId).get();
        return AutoMapper.mapToUserDTO(user);
    }

    @Override
    public void updateUser(UserInfoDto userDto) {
        UserInfoDto preUserInfo = findUserById(userDto.getId());
        UserInfo user = AutoMapper.mapToUser(userDto);

        userInfoRepository.save(user);
    }

    @Override
    public void delete(long userId){
        userInfoRepository.deleteById(userId);
    }
}
