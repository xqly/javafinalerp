package com.example.javafinalerp.Service;

import com.example.javafinalerp.Bean.UserInfo;

public interface UserInfoService {
    /**通过username查找用户信息;*/
    public UserInfo findByUsername(String username);

    public String getpass(String pass,String salt);
}