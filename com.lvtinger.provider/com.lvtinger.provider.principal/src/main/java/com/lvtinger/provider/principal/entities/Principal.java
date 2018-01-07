package com.lvtinger.provider.principal.entities;

import com.lvtinger.provider.common.PersistentObject;

import java.util.Date;

/**
 * 用户信息
 */
public class Principal extends PersistentObject {
    /**
     * 姓名
     */
    private String nickname;
    /**
     * 头像
     */
    private String avatar;
    /**
     * 性别
     */
    private int gender;
    /**
     * 生日
     */
    private Date birthday;

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Principal() {
    }

    public Principal(long id, String nickname, String avatar, int gender, Date birthday) {
        super(id);
        this.nickname = nickname;
        this.avatar = avatar;
        this.gender = gender;
        this.birthday = birthday;
    }

    public Principal(long id, long version, long timeline, int status, String nickname, String avatar, int gender, Date birthday) {
        super(id, version, timeline, status);
        this.nickname = nickname;
        this.avatar = avatar;
        this.gender = gender;
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Principal{" +
                "nickname='" + nickname + '\'' +
                ", avatar='" + avatar + '\'' +
                "} " + super.toString();
    }
}
