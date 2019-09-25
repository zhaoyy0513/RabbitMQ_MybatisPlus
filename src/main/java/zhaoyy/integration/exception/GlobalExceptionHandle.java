/**
 * 处理异常
 * @author zhangsong
 * @since 2019-07-31
 */
package zhaoyy.integration.exception;

import com.alibaba.fastjson.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.Nullable;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import zhaoyy.integration.vo.ErrorResponseEntity;

@RestControllerAdvice
public class GlobalExceptionHandle extends ResponseEntityExceptionHandler {

    private final Logger logger = LoggerFactory.getLogger(GlobalExceptionHandle.class);

    /**
     * 处理指定的异常
     */

    @ExceptionHandler(BaseWebException.class)
    @ResponseBody
    ResponseEntity<?> handleBaseWebException(BaseWebException err) {
        ErrorResponseEntity errorResponseEntity = err.getErrorResponseEntity();
        if (errorResponseEntity == null) {
            errorResponseEntity = new ErrorResponseEntity("系统出错");
        }
        return errorResponseEntity.build();
    }

    @ExceptionHandler
    @ResponseBody
    ResponseEntity<?> handleException(Error err) {
        logger.info(err.getMessage());
        return new ResponseEntity<>(err.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }


    /**
     * 路由解析出错,参数解析出错时跳转到该方法
     * @param ex
     * @param body
     * @param headers
     * @param status
     * @param request
     * @return
     */
    @Override
    protected ResponseEntity handleExceptionInternal(
            Exception ex, @Nullable Object body, HttpHeaders headers, HttpStatus status, WebRequest request) {
        ex.printStackTrace();
        logger.error("未 catch 错误.请求状态码{}, body:{}", status.value(), JSON.toJSONString(body));
        return ErrorResponseEntity.getInstance(HttpStatus.BAD_REQUEST, "参数解析出错").build();
    }

}
