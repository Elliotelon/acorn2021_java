package test.main;
/*
 * Scanner 객체를 이용해서 검색할 회원의 번호를 입력받아서
 * 입력받은 숫자를 이용해서 SELECT 문을 수행하고
 * 결과값을 MemberDto 객체를 생성해서 담아보세요.
 * 
 * 결과가 없다면 MemberDto 객체를 생성하지 마세요 (null인 상태로 두기)
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import test.member.dto.MemberDto;
import test.util.DBConnect;

public class MainClass07 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("검색할 번호 입력:");
		int num=scan.nextInt();
		
		//검색된 회원 정보가 담길 MemberDto 객체의 참조값을 담을 지역변수
		MemberDto dto=null;
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			//DBConnect 객체를 이용해서 Connection 객체의 참조값 얻어내기
			conn=new DBConnect().getConn();
			//실행할 sql문(SELECT)의 뼈대 구성하기(아직 미완성)
			String sql="SELECT name,addr FROM member WHERE num=?";
			//sql문을 대신 실행해 줄 객체의 참조값 얻어오기
			pstmt=conn.prepareStatement(sql);
			// ?에 값 바인딩하기
			pstmt.setInt(1, num);
			//SELECT 문 수행하고 결과를 ResultSet 으로 받기
			rs=pstmt.executeQuery();
			
			if(rs.next()) {//select 된 결과가 있다면
				//MemberDto 객체를 생성해서
				dto=new MemberDto();
				//setter 메소드를 이용해서 값을 담는다.
				dto.setNum(num);
				//ResultSet 객체에 있는 값도 얻어와서 담아준다.
				dto.setName(rs.getString("name"));
				dto.setAddr(rs.getString("addr"));
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
		//위의 try~catch~finally 절이 수행된후에 SELECT 된 결과가 있는지 없는지를
		//여기에서 쉽게 판별할 수 있는 방법이 있나요?
		if(dto==null) {
			System.out.println(num+" 번 회원은 존재 하지 않습니다.");
		}else {
			System.out.println("번호 : "+dto.getNum()+
					", 이름 : "+dto.getName()+", 주소 : "+dto.getAddr());
		}
	}
}
