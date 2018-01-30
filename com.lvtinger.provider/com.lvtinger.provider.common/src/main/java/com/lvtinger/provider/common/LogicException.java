package com.lvtinger.provider.common;

import java.io.Serializable;

/**
 * 业务异常
 * Created by lvtinger on 2017/12/6.
 */
public class LogicException extends RuntimeException {
    private int code;

    public LogicException(int code, String message) {
        super(message);
        this.code = code;
    }

    public <T extends Serializable> ActionResult<T> result() {

        return new ActionResult<T>(code, getMessage());
    }
}

