package com.nxq.movie.api.response;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
public class FieldError implements Serializable {

    private String fieldName;
    private String message;
}
