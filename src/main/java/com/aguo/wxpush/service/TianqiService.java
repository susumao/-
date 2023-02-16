package com.aguo.wxpush.service;

import com.alibaba.fastjson.JSONObject;

import java.util.Map;

public interface TianqiService {
    JSONObject getWeatherByCity();

    JSONObject getWeatherByIP();
    Map<String, String> getTheNextThreeDaysWeather();

}
