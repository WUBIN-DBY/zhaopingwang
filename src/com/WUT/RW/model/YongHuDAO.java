package com.WUT.RW.model;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.ResultSetHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
public class YongHuDAO {
	public List<Yonghu> listAll(){
		List<Yonghu> yh=null;
		try {
			 Class.forName("com.mysql.jdbc.Driver");
			 Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/zhaopingwang?serverTimezone=UTC","root","13367115356wb");
			 QueryRunner run = new QueryRunner();
			ResultSetHandler<List<Yonghu>> h = new BeanListHandler<Yonghu>(Yonghu.class);
			yh= run.query(connection,"SELECT * FROM yonghu", h);	
		}catch(Exception e) {
			yh=new ArrayList<>();
			e.printStackTrace();
		}
		return yh;
	}

}
