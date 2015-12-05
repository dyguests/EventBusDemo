package com.fanhl.eventbusdemo;

/**
 * Created by fanhl on 15/12/5.
 */
public class MessageEvent {

    private final String msg;

    public MessageEvent(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }
}
