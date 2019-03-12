package com.xiami.blog.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * 响应 值对象.
 */
@Getter
@Setter
@AllArgsConstructor
public class Response {
    private boolean success; //响应处理是否成功
    private String message; //响应处理的消息
    private Object body; //响应处理的返回内容

    public Response(boolean success, String message) {
        this.success = success;
        this.message = message;
    }
}
