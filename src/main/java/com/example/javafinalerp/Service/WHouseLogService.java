package com.example.javafinalerp.Service;
import java.util.List;
import com.example.javafinalerp.Bean.WHouseLog;

public interface WHouseLogService {
    List<WHouseLog> getWHLList();//获取所有
    List<WHouseLog> getGQLList();//获取过期的
    List<WHouseLog> getListByID(String x);//
}
