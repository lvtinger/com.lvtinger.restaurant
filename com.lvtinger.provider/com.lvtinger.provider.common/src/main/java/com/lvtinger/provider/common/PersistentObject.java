package com.lvtinger.provider.common;

import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by lvtinger on 2017/12/26.
 */
@MappedSuperclass
public class PersistentObject implements Serializable {
    private long version;
    private long timeline;
    private int status;

    public PersistentObject() {
    }


    public PersistentObject(long version, long timeline, int status) {
        this.version = version;
        this.timeline = timeline;
        this.status = status;
    }

    public long getVersion() {
        return version;
    }

    public void setVersion(long version) {
        this.version = version;
    }

    public long getTimeline() {
        return timeline;
    }

    public void setTimeline(long timeline) {
        this.timeline = timeline;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public void newly() {
        long timestamp = new Date().getTime();
        this.version = timestamp;
        this.timeline = timestamp;
        this.status = 1;
    }

    public void renew() {
        this.version = new Date().getTime();
    }

    public void clean() {
        this.version = new Date().getTime();
        this.status = 2;
    }

    @Override
    public String toString() {
        return "PersistentObject{" +
                "version=" + version +
                ", timeline=" + timeline +
                ", status=" + status +
                '}';
    }
}
