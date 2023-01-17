package com.springpostgresql.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class BotConfigControllerAdvice {
	
	@ResponseBody
	@ExceptionHandler(BotConfigNotFoundException.class)
	@ResponseStatus(code=HttpStatus.NOT_FOUND, value=HttpStatus.NOT_FOUND)
	String botConfigNotFoundHandler(BotConfigNotFoundException ex) {
		return "Bad Request";
	}

}
