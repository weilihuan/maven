package com.exp.master.core.entity;

/**
 * UserException : 用户自定义异常
 *
 * @author 覃班
 */
public class UserException extends RuntimeException {

    /**
     * 异常发生时间
     */
    private long date = System.currentTimeMillis();

    public long getDate() {
        return date;
    }
}
