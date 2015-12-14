package com.mtouche.locationservice.common.utils;

public class JsonUtil {

    static GsonHelper helper = new GsonHelper();

    public static String toJson(Object obj) {
        return helper.toJson(obj);
    }
}
