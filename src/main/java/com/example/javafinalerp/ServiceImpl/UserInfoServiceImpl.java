package com.example.javafinalerp.ServiceImpl;

import com.example.javafinalerp.Bean.UserInfo;
import com.example.javafinalerp.Dao.UserInfoDao;
import com.example.javafinalerp.Service.UserInfoService;
import org.apache.shiro.crypto.SecureRandomNumberGenerator;
import org.apache.shiro.crypto.hash.Md5Hash;
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

    @Override
    public String getpass(String pass,String salt) {
        String answ = new Md5Hash(pass,salt,2).toString();
        System.out.println(answ);
        return answ;
    }
}
