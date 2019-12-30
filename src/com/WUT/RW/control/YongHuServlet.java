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
		System.out.println("��ʾ���з�����");
		//����dao������ѯ�����û���Ϣ
		List<Yonghu> yh=dao.listAll();
		System.out.println(yh.size());
		//2����ѯ�����ݴ洢��request��Χ��
		request.setAttribute("yh", yh);
		request.getRequestDispatcher("").forward(request, response);
		
		break;
	}
	case"add":
	{
		System.out.println("�����û�������");
		break;
	}
	case"delete":
	{
		System.out.println("ɾ���û�������");
		break;
	}
	case"update":
	{
		System.out.println("�޸��û�������");
		break;
	}
	}
	}
}