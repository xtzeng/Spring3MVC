
/*
 * 文 件 名 : com.qisentech.springmvc.action.HelloWordController.java
 * 创建日期 : 2013-8-7 11:40:04
 * 创 建 者 : qsyang
 */
package com.qisentech.springmvc.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * <p>Title: </p>
 *
 * <p>Description: </p>
 *
 * @author qsyang
 * @version 1.0
 */
@Controller
@RequestMapping()
public class HelloWordController {

  
	@RequestMapping(value="hallo.do")
    public ModelAndView handleRequest() throws Exception {
        ModelAndView mv = new ModelAndView("hello");
        mv.addObject("title", "Spring MVC And Freemarker");
        mv.addObject("content", " Hello world ， test my first spring mvc ! ");
        return mv;
    }
}