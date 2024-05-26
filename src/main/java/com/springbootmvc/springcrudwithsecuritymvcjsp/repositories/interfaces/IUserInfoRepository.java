package com.springbootmvc.springcrudwithsecuritymvcjsp.repositories.interfaces;

import com.springbootmvc.springcrudwithsecuritymvcjsp.entities.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface IUserInfoRepository extends JpaRepository<UserInfo, Long> {
    Optional<UserInfo> findByUserName(String userName);
}
