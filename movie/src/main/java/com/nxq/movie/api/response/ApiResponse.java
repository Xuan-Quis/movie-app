package com.nxq.movie.api.response;


import lombok.Builder;
import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.data.domain.Page;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;


@Data
@Builder
public class ApiResponse<T> implements Serializable {

    private boolean success;
    private String message;
    private T data;
    private Paging paging;
    private List<FieldError> fieldErrors;
    private LocalDateTime timestamp;
    private HttpStatus status;

    public static <T> ApiResponse<T> error(String message, HttpStatus status) {
        return ApiResponse.<T>builder()
                .success(false)
                .message(message)
                .status(status)
                .timestamp(LocalDateTime.now())
                .build();
    }

    public static <T> ApiResponse<T> error(List<FieldError> fieldErrors) {
        return ApiResponse.<T>builder()
                .success(false)
                .status(HttpStatus.BAD_REQUEST)
                .timestamp(LocalDateTime.now())
                .build();
    }

    public static <T, V> ApiResponse<T> success(T data, Page<V> page){
        return ApiResponse.<T>builder()
                .success(true)
                .data(data)
                .timestamp(LocalDateTime.now())
                .paging(Paging.builder()
                        .currentPage(page.getNumber())
                        .pageSize(page.getSize())
                        .total(page.getTotalElements())
                        .build())
                .build();
    }
}
