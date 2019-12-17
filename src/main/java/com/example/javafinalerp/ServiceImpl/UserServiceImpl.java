package com.example.javafinalerp.ServiceImpl;

import com.example.javafinalerp.Bean.User;
import com.example.javafinalerp.Resitory.UserResitory;
import com.example.javafinalerp.Service.UserService;
import com.example.javafinalerp.tempfunc.Myfunc;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {


    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserResitory userResitory;

    @Resource
    Myfunc myfunc;

    @Override
    public User loginCheck(Integer ID, String Password) {
        User user = userResitory.loginFind(ID,Password);
        logger.info("123");
        return userResitory.loginFind(ID,Password);
    }

    @Override
    public List<User> getListByDept(Integer x){
        List<User> users = userResitory.gdeptList(x);
//        List<User> users = myfunc.getlistbyid(x);
        return users;

    }


    @Override
    public List<User> getListByID(Integer x, Integer dept) {
        return userResitory.getUserBydeid(x,dept);
    }

    @Override
    public List<User> getListByName(String name, Integer dept) {
        return userResitory.getUserBydename(name,dept);
    }

    @Override
    public User getUserByID(Integer id) {
        return userResitory.getUserByID(id);
    }

    @Override
    public void saveUser(User x) {
        userResitory.save(x);
    }

    @Override
    public void delByID(Integer x) {
        userResitory.deleteById(x);
    }
}
