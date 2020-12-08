package test.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/*
 * num이 804번인 회원의 
 * 
 * addr을 노량진으로 수정하는 코드를 작성해 보세요.
 * 
 */
public class MainClass04 {
	public static void main(String[] args) {
		int num=804;
		String addr="노량진";
		
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
		int flag=0;
		try {
			//미완성의 update문
			String sql="UPDATE member SET addr=? WHERE num=?";
			pstmt=conn.prepareStatement(sql);
			//?에 순서대로 값을 바인딩하기
			//바인딩=>binding=>연결하기=>붙이기=>???
			pstmt.setString(1, addr);
			pstmt.setInt(2, num);
			//완성된 sql문을 수정하고 변화된 row의 갯수를 리턴받는다.
			flag=pstmt.executeUpdate();
			System.out.println("회원정보를 저장했습니다.");
			
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			try {
				if(pstmt!=null)pstmt.close();
				if(conn!=null)pstmt.close();
			}catch(Exception e) {}
		}
		if(flag>0) {
			System.out.println("작업(UPDATE) 성공");
		}else {
			System.out.println("작업(UPDATE) 실패");
		}
	}
}
		