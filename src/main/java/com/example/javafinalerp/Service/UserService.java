package com.example.javafinalerp.Service;

import com.example.javafinalerp.Bean.User;

import java.util.List;

public interface UserService {
    User loginCheck(Integer ID,String Password);

    List<User> getListByDept(Integer x);

    List<User> getListByID(Integer x,Integer dept);

    List<User> getListByName(String name,Integer dept);

    User getUserByID(Integer id);

    void saveUser(User x);

    void delByID(Integer x);
}
