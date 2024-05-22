package com.prac.umc.web.dto;

import lombok.Builder;
import lombok.Getter;
import org.springframework.http.HttpStatus;

import java.io.Serializable;

@Getter
@Builder
public class ErrorReasonDTO {
    private String code;
    private String message;
    private boolean isSuccess;
    private HttpStatus httpStatus;
}