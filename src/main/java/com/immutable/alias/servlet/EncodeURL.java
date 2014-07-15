package com.immutable.alias.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EncodeURL extends HttpServlet{

	 /**
	 */
	private static final long serialVersionUID = 1L;

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)  
     throws ServletException, IOException {
		 
		 response.setCharacterEncoding("utf-8");  
		 response.setContentType("text/html;charset=utf-8");  
		 PrintWriter out = response.getWriter();  
		 request.getSession();  //创建session  
		 
		 request.getSession().setMaxInactiveInterval(60);
		 
		 logger.info("SessionId:========" + request.getSession().getId());
		 
		 //调用response的encodeURL方法，将自动将JSESSION追加到url后面，如：url;jsessionid=BD111FFC653497E81B702A29B3AC6FE4  
		 String buyurl = response.encodeURL("/urlencode");  
		 String payurl = response.encodeURL("/urlencode");  
		 out.print("<a href='"+buyurl+"'>购买</a><br/>");  
		 out.print("<a href='"+payurl+"'>结账</a><br/>");  
   
}  
}
