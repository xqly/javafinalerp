package com.example.javafinalerp.Service;

import com.example.javafinalerp.Bean.WHouseLog;

import java.util.List;

public interface WHouseService {
    List<WHouseLog> getinLog();
    List<WHouseLog> getlistbyid(Integer x);
    List<WHouseLog> getoutLog();
//    List<>
}
