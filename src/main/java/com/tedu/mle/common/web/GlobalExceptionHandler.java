package com.tedu.mle.common.web;


import com.tedu.mle.common.exception.ServiceException;
import com.tedu.mle.common.vo.JsonResult;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author zz
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(IncorrectCredentialsException.class)
    @ResponseBody
    public JsonResult doHandleIncorrectCredentialsException(IncorrectCredentialsException e) {
        e.printStackTrace();
        return new JsonResult(new Throwable("密码不正确"));
    }

    @ExceptionHandler(RuntimeException.class)
    @ResponseBody
    public JsonResult doHandleRunTimeException(RuntimeException e) {
        e.printStackTrace();
        return new JsonResult(e);
    }


}
