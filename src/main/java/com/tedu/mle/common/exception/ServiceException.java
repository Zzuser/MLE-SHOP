package com.tedu.mle.common.exception;

/**
 * @author zz
 */
public class ServiceException extends RuntimeException {
    public ServiceException(String s) {
        super(s);
    }

    public ServiceException(String message, Throwable cause) {
        super(message, cause);
    }

    public ServiceException(Throwable cause) {
        super(cause);
    }

    public ServiceException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public ServiceException() {
    }
}
