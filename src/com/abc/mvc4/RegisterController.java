package com.abc.mvc4;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterController extends HttpServlet 
{
	public void service(HttpServletRequest x,HttpServletResponse y)
	{
		try
		{
			String name=x.getParameter("name");
			String city=x.getParameter("city");
			String pwd=x.getParameter("pwd");
			RegisterModel rm=new RegisterModel();
			rm.setName(name);
			rm.setCity(city);
			rm.setPwd(pwd);
			boolean b=rm.register();
			if(b==true)
			{
				y.sendRedirect("/MVC4/RegisterSuccess.jsp");
			}
			else
			{
				y.sendRedirect("/MVC4/RegisterFailure.jsp");
			}
			
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
