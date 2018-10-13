package yto.net.cn.dto;

import java.io.Serializable;

public class Result<T> implements Serializable {
    private boolean status;//状态
    private T data;//数据
    private String reason;//原因

    public Result(){

    }

    public Result(boolean status, T data, String reason) {
        this.status = status;
        this.data = data;
        this.reason = reason;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}
