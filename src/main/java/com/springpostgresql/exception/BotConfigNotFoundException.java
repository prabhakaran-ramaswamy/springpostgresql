package com.springpostgresql.exception;

public class BotConfigNotFoundException extends Exception{

	private static final long serialVersionUID = 1L;

	public BotConfigNotFoundException() {
		super();
	}

	public BotConfigNotFoundException(String message) {
		super(message);
	}

}
