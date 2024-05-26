package com.springbootmvc.springcrudwithsecuritymvcjsp.repositories.implementations;

import com.springbootmvc.springcrudwithsecuritymvcjsp.entities.UserInfo;
import com.springbootmvc.springcrudwithsecuritymvcjsp.repositories.interfaces.IUserInfoCustomRepository;

public class UserInfoCustomRepository implements IUserInfoCustomRepository {

    @Override
    public UserInfo searchByGmailOrUserName(String userNameOrMail) {
        return null;
    }
}
