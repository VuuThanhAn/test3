package com.devteria.identity_service.exception;

public enum ErrorCode {
    USER_EXISTED(1001,"User existed."),
    INVALID_KEY(1001,"invalid message Key"),
    UNCATEGORIZED_EXIT(9999,"Uncategorized error."),
    USERNAME_INVALID(1003,"user name must be at least 3 characters"),
    INVALID_PASSWORD(1004,"password must be at least 8 characters"),
    USER_NOT_EXISTED(1005,"User not existed."),
    UNAUTHENTICATED(1006,"unauthenticated"),
    ;

    ErrorCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    private int code;
    private String message;

    public String getMessage() {
        return message;
    }

    public int getCode() {
        return code;
    }
}
