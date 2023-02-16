package com.aguo.wxpush.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface SendService {
    String sendWeChatMsg();
    String messageHandle(HttpServletRequest request, HttpServletResponse response);
}
