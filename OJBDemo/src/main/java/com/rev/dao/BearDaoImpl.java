package com.rev.dao;


import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.rev.beans.Bear;
import com.rev.beans.BearType;
import com.rev.beans.Cave;
import com.rev.util.ConnectionUtil;

public class BearDaoImpl implements BearDao {
	
	private static final String filename = "connection.properties";

	@Override
	public List<Bear> getBears() {
		
		List<Bear> bl = new ArrayList<>();
		try(Connection con = ConnectionUtil.getConnection(filename)){	
		String sql = "SELECT B.BEAR_ID, B.BEAR_NAME, B.WEIGHT, B.BIRTHDATE, C.CAVE_ID, C.CAVE_NAME, C.MAX_BEARS, BT.BEAR_TYPE_ID, BT.BEAR_TYPE_NAME\r\n" + 
				"FROM BEAR B\r\n" + 
				"INNER JOIN BEAR_TYPE BT\r\n" + 
				"ON B.BEAR_TYPE_ID = BT.BEAR_TYPE_ID\r\n" + 
				"INNER JOIN CAVE C\r\n" + 
				"ON B.CAVE_ID = C.CAVE_ID\r\n" + 
				"ORDER BY B.BEAR_ID;";
		Statement pstmt = con.createStatement();
		ResultSet rs = pstmt.executeQuery(sql);
		while(rs.next()) {
			int bearId = rs.getInt("BEAR_ID");
			String bearName = rs.getString("BEAR_NAME");
			double weight = rs.getDouble("WEIGHT");
			LocalDate birthDate =rs.getDate("BIRTHDATE").toLocalDate();
			int caveId = rs.getInt("CAVE_ID");
			String caveName = rs.getString("CAVE_NAME");
			int maxBears = rs.getInt("BEAR_ID");
			int bearTypeId = rs.getInt("BEAR_ID");
			String bearTypeName = rs.getString("BEAR_NAME");
			bl.add(new Bear(bearId,bearName, new Cave(caveId,caveName,maxBears),new BearType(bearTypeId,bearTypeName),weight,birthDate));			
		}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return bl;
	}

	@Override
	public Bear getBearById(int id) {
		Bear b = null;
		try(Connection con = ConnectionUtil.getConnection(filename)){
			
		
		String sql = "SELECT B.BEAR_ID, B.BEAR_NAME, B.WEIGHT, B.BIRTHDATE, C.CAVE_ID, C.CAVE_NAME, C.MAX_BEARS, BT.BEAR_TYPE_ID, BT.BEAR_TYPE_NAME\r\n" + 
				"FROM BEAR B\r\n" + 
				"INNER JOIN BEAR_TYPE BT\r\n" + 
				"ON B.BEAR_TYPE_ID = BT.BEAR_TYPE_ID\r\n" + 
				"INNER JOIN CAVE C\r\n" + 
				"ON B.CAVE_ID = C.CAVE_ID\r\n" + 
				"WEHRE B.BEAR_ID = ? " +
				"ORDER BY B.BEAR_ID";
		PreparedStatement pstmt = con.prepareStatement(sql);
		//pstmt.sentInt(1,id);
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()) {
			int bearId = rs.getInt("BEAR_ID");
			String bearName = rs.getString("BEAR_NAME");
			double weight = rs.getDouble("WEIGHT");
			LocalDate birthDate =rs.getDate("BIRTHDATE").toLocalDate();
			int caveId = rs.getInt("CAVE_ID");
			String caveName = rs.getString("CAVE_NAME");
			int maxBears = rs.getInt("BEAR_ID");
			int bearTypeId = rs.getInt("BEAR_ID");
			String bearTypeName = rs.getString("BEAR_NAME");
			//b = new Bear(new Bear(bearId,bearName, new Cave(caveId,caveName,maxBears),new BearType(bearTypeId,bearTypeName),weight,birthDate));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return b;
	}

	@Override
	public Double feedBear(int bearId, int hiveId, double amt) {
		// TODO Auto-generated method stub
		
		return null;
	}

}