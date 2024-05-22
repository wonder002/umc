package com.prac.umc.handler;

import com.prac.umc.GeneralException;
import com.prac.umc.basecode.BaseErrorCode;

public class TempHandler extends GeneralException {

    public TempHandler(BaseErrorCode errorCode) {
        super(errorCode);
    }
}

