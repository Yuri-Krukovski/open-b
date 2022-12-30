package com.example.ob.client;

public class ProviderClientException extends RuntimeException {

    private final int code;
    private final String message;

    public ProviderClientException(String message, int code, Throwable cause) {
        super(message, cause);
        this.message = message;
        this.code = code;
    }
}
