package com.cui.firstdemo.handler;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.multipart.MaxUploadSizeExceededException;
import org.springframework.web.servlet.ModelAndView;
import java.io.IOException;

/**
 * @author cui
 * @since 创建时间：2019/6/18 19:04
 */
@ControllerAdvice
public class CustomExceptionHandler {
    @ExceptionHandler(MaxUploadSizeExceededException.class)
//    public void uploadException(MaxUploadSizeExceededException e, HttpServletResponse response) throws IOException {
//        response.setContentType("text/html;charset=utf-8");
//        PrintWriter out = response.getWriter();
//        out.write("上传文件大小超出限制");
//        out.flush();
//        out.close();
//    }
    public ModelAndView uploadException(MaxUploadSizeExceededException e) throws IOException {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("msg", "上传文件大小超出限制!");
        modelAndView.setViewName("error");
        return modelAndView;
    }
}
