package com.example.javafinalerp.Resitory;

import com.example.javafinalerp.Bean.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserResitory extends JpaRepository<User,Integer> {

    @Query("select u from User u where u.U_ID=?1 and u.UPassword=?2")
    User loginFind(Integer x,String y);

    @Query("select u from User u where u.UDept=?1")
    List<User> gdeptList(Integer x);

    @Query("select u from User u where u.U_ID=?1")
    User getUserByID(Integer x);

    @Query("select u from User u where u.UDept=?2 and u.U_ID=?1")
    List<User> getUserBydeid(Integer x,Integer y);

    @Query("select u from User u where u.UName=?1 and u.UDept=?2")
    List<User> getUserBydename(String x,Integer y);

}
