package com.WUT.RW.control;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.WUT.RW.model.YongHuDAO;
import com.WUT.RW.model.Yonghu;
@WebServlet("/YongHu")
public class YongHuServlet extends HttpServlet {
	private YongHuDAO dao=new YongHuDAO();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      doPost(request,response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String method=request.getParameter("method");
	switch(method) {
	case"listAll":
	{
		System.out.println("显示所有方法！");
		//调用dao方法查询所有用户信息
		List<Yonghu> yh=dao.listAll();
		System.out.println(yh.size());
		//2将查询的数据存储到request范围内
		request.setAttribute("yh", yh);
		request.getRequestDispatcher("").forward(request, response);
		
		break;
	}
	case"add":
	{
		System.out.println("添加用户方法！");
		break;
	}
	case"delete":
	{
		System.out.println("删除用户方法！");
		break;
	}
	case"update":
	{
		System.out.println("修改用户方法！");
		break;
	}
	}
	}
}
