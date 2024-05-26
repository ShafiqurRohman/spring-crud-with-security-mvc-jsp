package com.springbootmvc.springcrudwithsecuritymvcjsp.repositories.interfaces;


import com.springbootmvc.springcrudwithsecuritymvcjsp.entities.UserInfo;

public interface IUserInfoCustomRepository {
    public UserInfo searchByGmailOrUserName(String userNameOrMail);
}
