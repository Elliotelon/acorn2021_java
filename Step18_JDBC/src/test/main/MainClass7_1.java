package test.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import test.member.dto.MemberDto;
import test.util.DBConnect;

public class MainClass7_1 {
	public static void main(String[] args) {
		
		MemberDto dto=null;
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		List<MemberDto> list=new ArrayList<>();
		
		try {
			conn=new DBConnect().getConn();
			String sql="SELECT*FROM member";
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			
			while(rs.next()) {
				dto=new MemberDto();
				dto.setNum(rs.getInt("num"));
				dto.setName(rs.getString("name"));
				dto.setAddr(rs.getString("addr"));
				list.add(dto);
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
