package com.example.javafinalerp.Service;

import com.example.javafinalerp.Bean.WHStatus;
import com.example.javafinalerp.Bean.WHouseLog;
import com.example.javafinalerp.Bean.WHouse;
import java.util.List;

public interface WHouseService {
//    void addWH(WHStatus x);
    void addWH(Integer gid,Integer num,Integer shop ,String Time,Integer whid);
    List<WHouseLog> getinLog();
    List<WHouseLog> getlistbyid(Integer x);
    List<WHouse> getwhbyid();
    List<WHouseLog> getoutLog();
    void outGoodsbysaleID(Integer x);
    List<WHStatus> getoutdatedlist();
    void DestroybySID(Integer x);

}
