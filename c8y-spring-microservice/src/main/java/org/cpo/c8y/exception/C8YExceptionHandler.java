package org.cpo.c8y.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import feign.FeignException;
import jakarta.servlet.http.HttpServletRequest;

@RestControllerAdvice
public class C8YExceptionHandler {

    @ExceptionHandler(FeignException.class)
    public ResponseEntity<String> handle(final HttpServletRequest request, final FeignException e) {
        return ResponseEntity.status(e.status()).body(e.contentUTF8());
    }
}
