package net.guides.springboot2.springboot2jpacrudexample.exception;

public class InvalidCSVFileException extends RuntimeException{
	
	private static final long serialVersionUID = 1L;

	public InvalidCSVFileException(String message)

	{
		super(message);
	}

}
