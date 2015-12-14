package com.mtouche.locationservice.model;

public class ApiResponse {

    private ApiResponseStatus status;
    private String message;
    private String data;

    // private int errorCode;

    public ApiResponseStatus getStatus() {
        return status;
    }

    public void setStatus(ApiResponseStatus status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
