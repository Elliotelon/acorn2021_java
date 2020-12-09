package test.member.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import test.member.dto.MemberDto;
import test.util.DBConnect;

/*
 * 회원정보(member 테이블)의 내용을
 * select
 * insert
 * update
 * delete
 * 작업을 할 객체를 생성할 클래스 설계하기
 * 
 */
public class MemberDao {
	//회원 한명의 정보를 저장하는 메소드를 만들어 보세요.
	//메소드명 : insert
	//리턴 type : 알아서
	//메소드에 전달하는 인자의 type : MemberDto
	public boolean insert(MemberDto dto) {
		Connection conn=null;
		PreparedStatement pstmt=null;
		int flag=0;
		try {
			DBConnect c=new DBConnect();
			conn=c.getConn();
			String sql="INSERT INTO member(num,name,addr) VALUES(?,?,?)";
			pstmt=conn.prepareStatement(sql);
			
			pstmt.setInt(1, dto.getNum());
			pstmt.setString(2, dto.getName());
			pstmt.setString(3, dto.getAddr());
			
			flag=pstmt.executeUpdate();
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			try {
				if(pstmt!=null)pstmt.close();
				if(conn!=null)pstmt.close();
			}catch(Exception e) {}
		}
		if(flag>0) {
			return true;
		}else {
			return false;
		}
	}	
	
	//회원 한명의 정보를 수정하는 메소드를 만들어 보세요.
	//메소드명 : update
	//리턴 type : 알아서
	//메소드에 전달하는 인자의 type : MemberDto
	public boolean update(MemberDto dto) {
		Connection conn=null;
		PreparedStatement pstmt=null;
		int flag=0;
		try {
			DBConnect c=new DBConnect();
			conn=c.getConn();
			String sql="UPDATE member SET addr=? , name=? WHERE num=?";
			pstmt=conn.prepareStatement(sql);
			
			pstmt.setString(1, dto.getAddr());
			pstmt.setString(2, dto.getName());
			pstmt.setInt(3, dto.getNum());
			
			flag=pstmt.executeUpdate();
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			try {
				if(pstmt!=null)pstmt.close();
				if(conn!=null)pstmt.close();
			}catch(Exception e) {}
		}
		if(flag>0) {
			return true;
		}else {
			return false;
		}
	}
	
	//회원 한명의 정보를 삭제하는 메소드
	public boolean delete(int num) {
		
		//필요한 참조값을 담을 지역변수 미리 만들고 초기화 하기
		Connection conn=null;
		PreparedStatement pstmt=null;
		int flag=0;
		try {
			//Connection 객체의 참조값 얻어오기
			DBConnect c=new DBConnect();
			conn=c.getConn();
			
			//실행할 sql문의 뼈대 준비하기
			String sql="DELETE FROM member WHERE num=? ";
			//PreparedStatement 객체의 참조값 얻어오기
			pstmt=conn.prepareStatement(sql);
			//?에 값 바인딩 하기
			pstmt.setInt(1, num);
			//sql문 실행하고 변화된 row의 갯수 리턴받기
			flag=pstmt.executeUpdate();
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			//마무리 작업
				try {
					if(pstmt!=null)pstmt.close();
					if(conn!=null)pstmt.close();
				}catch(Exception e) {}
		}
		if(flag>0) {
			return true;
		}else {
			return false;
		}
	}
}
