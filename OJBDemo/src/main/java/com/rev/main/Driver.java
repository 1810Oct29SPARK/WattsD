package com.rev.main;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.rev.beans.Bear;
import com.rev.dao.BearDao;
import com.rev.dao.BearDaoImpl;
import com.rev.util.ConnectionUtil;

public class Driver {

	public static void main(String[] args) {
		init();
		BearDao bd = new BearDaoImpl();
		//List<Bear> bears = bd.getBears();
		//for(Bear b : bears) {
			System.out.println(bd.getBearById(72));
			System.out.println(bd.feedBear(72,2,10));
		//}
	}
	
	static void init() {
		try {
			Connection con = ConnectionUtil.getConnection("connection.properties");
			System.out.println(con);
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}