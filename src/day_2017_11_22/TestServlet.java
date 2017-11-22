package day_2017_11_22;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class TestServlet implements Servlet{

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("destory");
		
	}

	@Override
	public ServletConfig getServletConfig() {
		System.out.println("geServletconfig");
		return null;
	}

	@Override
	public String getServletInfo() {
		System.out.println("getservletinfo");
		return null;
	}

	@Override
	public void init(ServletConfig servletConfig) throws ServletException {
		// TODO Auto-generated method stub
		String name=servletConfig.getInitParameter("user");
		System.out.println("user:"+">>>>>>>"+name);
		Enumeration<String> names=servletConfig.getInitParameterNames();
		while(names.hasMoreElements()) {
			String name1=names.nextElement();
			String value1=servletConfig.getInitParameter(name1);
			System.out.println(name1+">>>>>>>"+value1);
		}
		System.out.println("init");
	}

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("service");
	}
	
	public TestServlet() {
		
		System.out.println("servlet's constructor");
	}
}
