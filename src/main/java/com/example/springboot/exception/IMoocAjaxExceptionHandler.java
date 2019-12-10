package com.example.springboot.exception;

import javax.servlet.http.HttpServletRequest;

import com.example.springboot.pojo.IMoocJSONResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


//@RestControllerAdvice
public class IMoocAjaxExceptionHandler {

//	@ExceptionHandler(value = Exception.class)
	public IMoocJSONResult defaultErrorHandler(HttpServletRequest req,
											   Exception e) throws Exception {

		e.printStackTrace();
		return IMoocJSONResult.errorException(e.getMessage());
	}
}
