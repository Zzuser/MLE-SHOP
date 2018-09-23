package com.tedu.mle.common.web;


import com.tedu.mle.common.exception.ServiceException;
import com.tedu.mle.common.vo.JsonResult;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author zz
 */
@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(RuntimeException.class)
    @ResponseBody
    public JsonResult doHandleRunTimeException(RuntimeException e) {
        e.printStackTrace();
        return new JsonResult(e);
    }
}
