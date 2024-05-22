package com.prac.umc.basecode;


import com.prac.umc.web.dto.ErrorReasonDTO;

public interface BaseErrorCode {
    public ErrorReasonDTO getReason();

    public ErrorReasonDTO getReasonHttpStatus();
}
