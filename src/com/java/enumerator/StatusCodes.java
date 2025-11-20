package com.java.enumerator;

public enum StatusCodes {
    SUCCESS(200), NOTFOUND(404), BADREQUEST(400);

    private int code;

    StatusCodes(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
