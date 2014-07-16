
package com.myapps.controllers;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="/path")//表示要访问这个action的时候都要加上这个/path路径
public class HelloWorldController {
 
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	/* 接收参数getParameter()的时候:
	 * 如果地址栏/springmvc/hello.htm上面没有传递参数,那么当id为int型的时候会报错,当id为Integer的时候值为null
	 * 当地址栏为/springmvc/hello.htm?id=10的时候,action中有三种接收方式
	 * 1、String hello(@RequestParam(value = "userid") int id),这样会把地址栏参数名为userid的值赋给参数id,如果用地址栏上的参数名为id,则接收不到
	 * 2、String hello(@RequestParam int id),这种情况下默认会把id作为参数名来进行接收赋值
	 * 3、String hello(int id),这种情况下也会默认把id作为参数名来进行接收赋值
	 * 注:如果参数前面加上@RequestParam注解,如果地址栏上面没有加上该注解的参数,例如:id,那么会报404错误,找不到该路径
	 */
	@RequestMapping(value="haha.do")
	public ModelAndView helloWord() {
		logger.info("haha.do");
		return new ModelAndView("helloworldPage", "name", "xtz");
	}
	
	
	@RequestMapping(value="hello.do")
	public ModelAndView hello(int id,Map<String, Object> map) {
		
		logger.info("hello.do Action" +id);
		map.put("name", "huangjie");
		map.put("string", "一个字符串");
		return new ModelAndView("hello");
	}
	
	@RequestMapping(value="index.do")
	public String index(int id) {
		
		logger.info("index.do Action id====="+id);
		return "redirect:/index.jsp?id="+id;//不能重定向web-info里面的文件,而且需要写上绝对路径
	}
	
	
	@RequestMapping(value="redicect.do")
	public String rederect(int id) {
		logger.info("Redirect id ============"+id);
		return "redirect:/WEB-INF/views/redirect.jsp?id=" + id;
	}
	
	
	@RequestMapping(value="/request.do")
	public String fromRequest(HttpServletRequest request) {
		String id = request.getParameter("id");
		logger.info("From request.getParameter:"+id);
		return "hello"; //相当于return new ModelAndView("hello");
	}
	
}
