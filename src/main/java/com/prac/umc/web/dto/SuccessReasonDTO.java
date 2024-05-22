package com.prac.umc.web.dto;

import lombok.Builder;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Builder
@Getter
public class SuccessReasonDTO {
    private String code;
    private String message;
    private boolean isSuccess;
    private HttpStatus httpStatus;
}
