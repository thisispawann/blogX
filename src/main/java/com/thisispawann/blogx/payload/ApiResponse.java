package com.thisispawann.blogx.payload;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ApiResponse {

    private String message;
    private boolean success;

    public ApiResponse(String message) {
        this.message = message;
        this.success = true;
    }
}
