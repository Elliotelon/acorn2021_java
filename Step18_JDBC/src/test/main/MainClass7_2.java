package test.main;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import test.util.DBConnect;

public class MainClass7_2 {
	public static void main(String[] args) {
		
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		List<Map<String, Object>> list=new ArrayList<>();
		
		try {
			conn=new DBConnect().getConn();
			String sql="SELECT*FROM member";
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			
			while(rs.next()) {
				Map<String, Object> map=new HashMap<>();
				map.put("num", rs.getInt("num"));
				map.put("name", rs.getString("name"));
				map.put("addr", rs.getString("addr"));
				list.add(map);
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			try {
				if(pstmt!=null)pstmt.close();
				if(conn!=null)pstmt.close();
				if(rs!=null)pstmt.close();
			}catch(Exception e) {}
		}
	}
}
