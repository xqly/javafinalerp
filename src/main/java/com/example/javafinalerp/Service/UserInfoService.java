package com.example.javafinalerp.Service;


import com.example.javafinalerp.Bean.UserInfo;

public interface UserInfoService {
    public UserInfo findByUsername(String username);
}
