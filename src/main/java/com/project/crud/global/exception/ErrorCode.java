package com.project.crud.global.exception;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum ErrorCode {
    // ***Member***
    MEMBER_ALREADY(HttpStatus.CONFLICT, "이미 가입된 유저입니다."),
    ;
    private final HttpStatus httpStatus;
    private String message;
}
