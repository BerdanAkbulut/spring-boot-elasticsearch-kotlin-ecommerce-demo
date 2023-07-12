package com.berdanakbulut.kotlinecommercedemo.exceptions

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestControllerAdvice

@RestControllerAdvice
class ExceptionHandlerClass {
    @ExceptionHandler(NotFoundException::class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    fun handleNotFoundException(notFoundException: NotFoundException): HashMap<String, String> {
        return HashMap<String, String>().apply { put("errorMessage", notFoundException.message) }
    }
}