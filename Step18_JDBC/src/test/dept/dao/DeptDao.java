package test.dept.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import test.dept.dto.DeptDto;
import test.util.DBConnect;

public class DeptDao {
	//모든 회원의 정보를 SELECT 해서 리턴하는 메소드
	public List<DeptDto> selectAll(){
		//MemberDto 객체를 누적시킬 ArrayList 객체 생성하기
		List<DeptDto> list=new ArrayList<>();
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			conn=new DBConnect().getConn();
			//실행할 SELECT문 작성
			String sql="SELECT*FROM dept ORDER BY deptno DESC";
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				//select 된 row 하나의 정보를 MemberDto 객체를 생성해서 담고
				DeptDto dto=new DeptDto();
				dto.setDeptno(rs.getInt("deptno"));
				dto.setDname(rs.getString("dname"));
				dto.setLoc(rs.getString("loc"));
				//새로 생성한 MemberDto 객체의 참조값을 ArrayList 객체에 누적시킨다.
				list.add(dto);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(conn!=null)conn.close();
				if(pstmt!=null)pstmt.close();
				if(rs!=null)rs.close();
			}catch(Exception e) {}
		}
		return list;
	} 
	
	//회원의 한명의 정보를 선택하는 메소드
	public DeptDto select(int deptno) {
		//회원한명의 정보를 담고 있는 MemberDto 객체를 담을 지역변수 만들기
		DeptDto dto=null;
		//필요한 객체의 참조값을 담을 지역변수 만들기
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			conn=new DBConnect().getConn();
			String sql="SELECT dname,loc FROM dept WHERE deptno=?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, deptno);
			rs=pstmt.executeQuery();
			
			if(rs.next()) {//만일 select 된 row가 있다면
				//결과를 MemberDto 객체를 생성해서 담는다.
				dto=new DeptDto(); 
				dto.setDeptno(deptno);
				dto.setDname(rs.getString("dname"));
				dto.setLoc(rs.getString("loc"));
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			try {
				//객체들을 무한정 만들어 낼 수 없어서 닫아주어야 다른 사람들도 사용가능하다.
				if(pstmt!=null)pstmt.close();
				if(conn!=null)pstmt.close();
				if(rs!=null)pstmt.close();
			}catch(Exception e) {}
		}
		return dto;
	}
	
	//회원 한명의 정보를 저장하는 메소드를 만들어 보세요.
	//메소드명 : insert
	//리턴 type : 알아서
	//메소드에 전달하는 인자의 type : MemberDto
	public boolean insert(DeptDto dto) {
		Connection conn=null;
		PreparedStatement pstmt=null;
		int flag=0;
		try {
			DBConnect c=new DBConnect();
			conn=c.getConn();
			String sql="INSERT INTO dept(deptno,dname,loc) VALUES(?,?,?)";
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, dto.getDeptno());
			pstmt.setString(2, dto.getDname());
			pstmt.setString(3, dto.getLoc());
	
			//INSERT문 수행하기
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
	public boolean update(DeptDto dto) {
		Connection conn=null;
		PreparedStatement pstmt=null;
		int flag=0;
		try {
			DBConnect c=new DBConnect();
			conn=c.getConn();
			//실행할 sql문 작성
			String sql="UPDATE dept SET loc=? , dname=? WHERE deptno=?";
			pstmt=conn.prepareStatement(sql);
			//?에 값을 바인딩할게 있으면 여기서 한다.
			pstmt.setString(1, dto.getLoc());
			pstmt.setString(2, dto.getDname());
			pstmt.setInt(3, dto.getDeptno());
			
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
	public boolean delete(int deptno) {
		
		//필요한 참조값을 담을 지역변수 미리 만들고 초기화 하기
		Connection conn=null;
		PreparedStatement pstmt=null;
		int flag=0;
		try {
			//Connection 객체의 참조값 얻어오기
			DBConnect c=new DBConnect();
			conn=c.getConn();
			
			//실행할 sql문의 뼈대 준비하기
			String sql="DELETE FROM dept WHERE deptno=? ";
			//PreparedStatement 객체의 참조값 얻어오기
			pstmt=conn.prepareStatement(sql);
			//?에 값 바인딩 하기
			pstmt.setInt(1, deptno);
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
