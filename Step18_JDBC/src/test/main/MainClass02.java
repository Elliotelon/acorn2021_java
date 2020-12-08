package test.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/*
 * 접속 ip주소 : 14.63.164.99
 * 아이디 : acorn01
 * 비밀번호 : tiger01
 * 
 * 위의 DB에 접속해서
 * emp 테이블의 내용중에서 사원번호(empno), 사원이름(ename), 부서번호deptno)를
 * select 해서 콘솔창에 출력해 보세요.
 * 단, 사원번호에 대해서 오름차순 정렬해서...
 * 
 */
public class MainClass02 {
	public static void main(String[] args) {
		Connection conn=null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url="jdbc:oracle:thin:@14.63.164.99:1521:xe";
			conn=DriverManager.getConnection(url, "acorn01", "tiger01");
			System.out.println("Oracle DB 접속 성공");
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			String sql="SELECT empno,ename,deptno FROM emp ORDER BY empno ASC";
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				int empno=rs.getInt("empno");
				String ename=rs.getString("ename");
				int deptno=rs.getInt("deptno");
				System.out.println(empno+"|"+ename+"|"+deptno);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
				try {
					if(rs!=null)rs.close();
					if(pstmt!=null)pstmt.close();
					if(conn!=null)conn.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
				System.out.println("main 메소드가 종료 됩니다.");
		}
	}
}
