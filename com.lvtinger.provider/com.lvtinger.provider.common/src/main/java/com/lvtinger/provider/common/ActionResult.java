package com.lvtinger.provider.common;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ActionResult<T extends Serializable> {
    private int code;
    private String message;
    private T content;
    private Map<String, List<String>> extend;

    public ActionResult() {
    }

    public ActionResult(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public ActionResult(T content) {
        this.code = 200;
        this.content = content;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    public Map<String, List<String>> getExtend() {
        return extend;
    }

    public void setExtend(Map<String, List<String>> extend) {
        this.extend = extend;
    }

    @Override
    public String toString() {
        return "ActionResult{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", content=" + content +
                '}';
    }
}