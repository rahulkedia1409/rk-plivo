package com.plivo.client;

public enum StatusCode {


    HTTP_OK("HTTP_OK",200),
    HTTP_ACCEPTED("HTTP_ACCEPTED", 202);

    StatusCode(String value, int id) {
        this.value = value;
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public int getId() {
        return id;
    }

    private final String value;
    private final int id;
}
