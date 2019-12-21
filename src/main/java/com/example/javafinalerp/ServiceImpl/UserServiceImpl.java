package com.example.javafinalerp.ServiceImpl;

import com.example.javafinalerp.Bean.User;
import com.example.javafinalerp.Bean.UserInfo;
import com.example.javafinalerp.Resitory.UserInfoResitory;
import com.example.javafinalerp.Resitory.UserResitory;
import com.example.javafinalerp.Service.UserService;
import com.example.javafinalerp.tempfunc.IDfunc;
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

    @Autowired
    UserInfoResitory userInfoResitory;

    @Resource
    IDfunc iDfunc;

    @Override
    public List<User> getListByDept(Integer x){
        List<User> users = userResitory.gdeptList(x);
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

    @Override
    public void addUser(User x) {
        saveUser(x);
        UserInfo userInfo = new UserInfo();
        userInfo.setName(x.getUName());
        userInfo.setSalt(Myfunc.createSalt());
        userInfo.setUsername(iDfunc.user().toString());
        userInfo.setPassword(Myfunc.md5("123456",userInfo.getUsername()+userInfo.getSalt()));
        userInfoResitory.save(userInfo);

    }
}
