package Backend.exception;

import Backend.Application;
import Backend.common.Result;

import org.apache.commons.logging.*;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice(basePackages = "Backend.controller")
public class GlobalExceptionHandler {
    private static final Log log = LogFactory.getLog(Application.class);

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Result error(HttpServletRequest req, CustomException ex) {
        log.error("异常信息:",ex);
        return Result.error();
    }

    @ExceptionHandler(CustomException.class)
    @ResponseBody
    public Result CustomError(HttpServletRequest req, CustomException ex) {
        return Result.error(ex.getCode(),ex.getMessage());
    }
}
