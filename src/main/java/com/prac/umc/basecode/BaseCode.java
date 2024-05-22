package com.prac.umc.basecode;

import com.prac.umc.web.dto.SuccessReasonDTO;

public interface BaseCode {
    public SuccessReasonDTO getReason();
    public SuccessReasonDTO getReasonHttpStatus();
}
