package com.example.javafinalerp.Resitory;

import com.example.javafinalerp.Bean.OW;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface OWResitory extends JpaRepository<OW,Integer> {
    @Query("select w from OW w where w.OID=?1")
    List<OW> findlistbyoid(Integer x);

    @Query("select w from OW w where w.OID=?1 and w.GID=?2")
    OW findbyoidandgid(Integer oid ,Integer gid);
}
