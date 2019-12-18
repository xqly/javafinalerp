package com.example.javafinalerp.Service;

import com.example.javafinalerp.Bean.WHStatus;
import com.example.javafinalerp.Bean.WHouseLog;

import java.util.List;

public interface WHouseService {
    void addWH(WHStatus x);
    List<WHouseLog> getinLog();
    List<WHouseLog> getlistbyid(Integer x);
    List<WHouseLog> getoutLog();
    void outGoodsbysaleID(Integer x);
    void DestroyGoodsbySID(Integer x);
    List<WHStatus> getoutdatedlist();
    void DestroybySID(Integer x);

}
