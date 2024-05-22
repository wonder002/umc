package com.prac.umc.status;

import com.prac.umc.basecode.BaseCode;
import com.prac.umc.web.dto.SuccessReasonDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public enum SuccessStatus implements BaseCode {

    // 가장 일반적인 응답
    _OK(HttpStatus.OK, "COMMON200", "성공"),

    // 예시
    USER_CREATED(HttpStatus.CREATED, "USER201", "사용자 생성 성공"),
    USER_UPDATED(HttpStatus.OK, "USER200", "사용자 정보 수정 성공"),
    USER_DELETED(HttpStatus.OK, "USER200", "사용자 삭제 성공"),

    ARTICLE_CREATED(HttpStatus.CREATED, "ARTICLE201", "게시글 생성 성공"),
    ARTICLE_UPDATED(HttpStatus.OK, "ARTICLE200", "게시글 수정 성공"),
    ARTICLE_DELETED(HttpStatus.OK, "ARTICLE200", "게시글 삭제 성공");

    private final HttpStatus httpStatus;
    private final String code;
    private final String message;

    @Override
    public SuccessReasonDTO getReason() {
        return SuccessReasonDTO.builder()
                .message(message)
                .code(code)
                .isSuccess(true)
                .build();
    }

    @Override
    public SuccessReasonDTO getReasonHttpStatus() {
        return SuccessReasonDTO.builder()
                .message(message)
                .code(code)
                .isSuccess(true)
                .httpStatus(httpStatus)
                .build();
    }
}