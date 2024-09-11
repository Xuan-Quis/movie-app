package com.nxq.movie.api.exception;

import lombok.Getter;

@Getter
public class InvalidArgumentException extends RuntimeException {

    private final String fieldName;

    public InvalidArgumentException(String message, String fieldName) {
        super(message);
        this.fieldName = fieldName;

    }
}
