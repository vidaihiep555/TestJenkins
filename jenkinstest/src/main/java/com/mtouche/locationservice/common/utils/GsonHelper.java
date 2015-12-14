package com.mtouche.locationservice.common.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class GsonHelper {
    private GsonBuilder getGsonBuilder() {
        return new GsonBuilder().serializeNulls().setPrettyPrinting();
    }

    public String toJson(Object obj) {
        Gson gson = getGsonBuilder().create();
        return gson.toJson(obj);
    }
}
