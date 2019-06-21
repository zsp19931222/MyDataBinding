package com.zsp.bean;

/**
 * description:
 * author:created by Andy on 2019/6/20 0020 10:17
 * email:zsp872126510@gmail.com
 */
public class UserBean {
    private String name;
    private int age;
    private String imageUrl;

    public UserBean(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public UserBean(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
