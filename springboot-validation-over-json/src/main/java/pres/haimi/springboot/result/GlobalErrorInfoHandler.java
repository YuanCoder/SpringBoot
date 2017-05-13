package pres.haimi.springboot.result;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by HaimiZhou on 2017/5/11.
 */
//控制层通知器
//@ControllerAdvice 和 @ResponseBody 的语义结合。是控制器增强，直接返回对象。
//这里用于统一拦截异常，然后返回错误码对象体。

@RestControllerAdvice
public class GlobalErrorInfoHandler {
    //@ExceptionHandler 注解，标记了使用 errorHandlerOverJson() 方法来处理 GlobalErrorInfoException 异常。
    @ExceptionHandler(value=GlobalErrorInfoException.class)
    public ResultBody errorHandlerOverJson(
            HttpServletRequest request,
            GlobalErrorInfoException exception){
        ErrorInfoInterface errorInfo = exception.getErrorInfo();
        ResultBody result=new ResultBody(errorInfo);
        return result;
    }

}
