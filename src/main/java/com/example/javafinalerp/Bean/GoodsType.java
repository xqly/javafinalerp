package com.example.javafinalerp.Bean;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class GoodsType {
    @Id
    @GeneratedValue

    private Integer GTypeID;
    private String TypeName;


    public Integer getGType() {
        return GTypeID;
    }

    public void setGType(Integer GType) {
        this.GTypeID = GType;
    }

    public String  getTypeName() {
        return TypeName;
    }

    public void setTypeName(String TypeName) {
        this.TypeName = TypeName;
    }
}
