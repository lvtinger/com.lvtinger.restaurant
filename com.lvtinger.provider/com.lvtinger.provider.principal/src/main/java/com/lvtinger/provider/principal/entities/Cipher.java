package com.lvtinger.provider.principal.entities;


import com.lvtinger.provider.common.PersistentObject;

/**
 * 密码
 */
public class Cipher extends PersistentObject {
    private long principalId;
    private String password;

    public long getPrincipalId() {
        return principalId;
    }

    public void setPrincipalId(long principalId) {
        this.principalId = principalId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Cipher() {
    }

    public Cipher(long id, long version, long timeline, int status, long principalId, String password) {
        super(id, version, timeline, status);
        this.principalId = principalId;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Cipher{" +
                "principalId=" + principalId +
                ", password='" + password + '\'' +
                "} " + super.toString();
    }
}
