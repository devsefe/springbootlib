package com.devsefe.lib.springbootlib.test;

import javax.persistence.Entity;
import java.io.Serializable;

@Entity
public class TestEntity implements Serializable {
    public int id;
    public String name;
}
