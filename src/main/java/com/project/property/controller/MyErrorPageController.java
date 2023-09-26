package com.project.property.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author Mr.Wang
 * @Date 2020/5/27
 * @Description 下一位读我代码的人, 有任何疑问请联系我, QQ：1459221616
 * 自定义的异常跳转页
 */
@Controller
public class MyErrorPageController {

    /**
     * 404错误的跳转地址
     * @return
     */
    @RequestMapping("error-404")
    public String toPage404(){
        return "error/error-404";
    }

    /**
     * 400错误的跳转地址
     * @return
     */
    @RequestMapping("error-400")
    public String toPage400(){
        return "error/error-400";
    }

    /**
     * 401错误的跳转地址
     * @return
     */
    @RequestMapping("error-401")
    public String toPage401(){
        return "error/error-401";
    }

    /**
     * 500错误的跳转地址
     * @return
     */
    @RequestMapping("error-500")
    public String toPage500(){
        return "error/error-500";
    }
}
