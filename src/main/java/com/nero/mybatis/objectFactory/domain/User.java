package com.nero.mybatis.objectFactory.domain;

public class User {
    private long id; // 主键
    private String name;
    private String sex;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "{" +
                "\"id\":" + id +
                ", \"name\":\"" + name + '\"' +
                ", \"sex\":\"" + sex + '\"' +
                '}'+ getClass().getName() + "@" + Integer.toHexString(hashCode());
    }
}
