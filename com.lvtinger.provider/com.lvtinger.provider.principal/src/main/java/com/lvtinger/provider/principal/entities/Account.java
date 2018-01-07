package com.lvtinger.provider.principal.entities;


import com.lvtinger.provider.common.PersistentObject;

/**
 * 账户表
 */
public class Account extends PersistentObject {

    private long principalId;
    private String username;

    public long getPrincipalId() {
        return principalId;
    }

    public void setPrincipalId(long principalId) {
        this.principalId = principalId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Account() {
    }

    public Account(long id, long principalId, String username) {
        super(id);
        this.principalId = principalId;
        this.username = username;
    }

    public Account(long id, long version, long timeline, int status, long principalId, String username) {
        super(id, version, timeline, status);
        this.principalId = principalId;
        this.username = username;
    }

    @Override
    public String toString() {
        return "Account{" +
                "principalId=" + principalId +
                ", username='" + username + '\'' +
                "} " + super.toString();
    }
}