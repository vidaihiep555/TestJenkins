package com.mtouche.locationservice.model;

/**
 * Json return to agent app command response status
 *
 * @author Vidal
 * @version 1.0.0
 */
public enum ApiResponseStatus {

    SUCCESS("success"), FAIL("fail");

    private String value;

    ApiResponseStatus(String des) {
        this.value = des;
    };

    @Override
    public String toString() {
        return value;
    }

}
