package com.example.javafinalerp.ServiceImpl;

import com.example.javafinalerp.Bean.UserInfo;
import com.example.javafinalerp.Service.UserInfoService;
import com.example.javafinalerp.dao.UserInfoDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserInfoServiceImpl implements UserInfoService {
    @Resource
    private UserInfoDao userInfoDao;

    @Override
    public UserInfo findByUsername(String username) {
        System.out.println("UserInfoServiceImpl.findByUsername()");
        return userInfoDao.findByUsername(username);
    }
}
