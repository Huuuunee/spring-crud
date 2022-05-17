package com.project.crud.global.exception.handler;


import com.project.crud.global.exception.CustomException;
import com.project.crud.global.exception.ErrorResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@Order( Ordered.HIGHEST_PRECEDENCE)
@RestControllerAdvice
public class GlobalExceptionHandler {

        @ExceptionHandler(CustomException.class)
        public ResponseEntity<ErrorResponse> handleConflict(CustomException e) {
                ErrorResponse build = new ErrorResponse(e.getErrorCode().getHttpStatus().value(),e.getErrorCode().getMessage());

                return new ResponseEntity<>(build, e.getErrorCode().getHttpStatus());

        }
}
