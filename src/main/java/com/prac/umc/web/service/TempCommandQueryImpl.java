package com.prac.umc.web.service;

import com.prac.umc.status.ErrorStatus;
import com.prac.umc.handler.TempHandler;
import org.springframework.stereotype.Service;

@Service
public class TempCommandQueryImpl implements TempQueryService{

    @Override
    public void CheckFlag(Integer flag) {
        if (flag == 1)
            throw new TempHandler(ErrorStatus.TEMP_EXCEPTION);
    }
}