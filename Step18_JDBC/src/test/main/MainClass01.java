package test.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/*
 *  Java DataBase Connectivity (JDBC)
 *  
 *  - oracle 에 연결하기 위해서는 드라이버가 들어 있는 ojdbc6.jar 파일이 필요하다 
 *  - 프로젝트 설정에서 ojdbc6.jar 를 사용할 준비를 해야한다. 
 */
public class MainClass01 {
	public static void main(String[] args) {
		//DB 연결 객체를 담을 지역변수
		Connection conn=null;
		try {
			//드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//접속할 DB 정보
			String url="jdbc:oracle:thin:@14.63.164.99:1521:xe";
			//String url="jdbc:oracle:thin:@localhost:1521:xe";
			//접속하고 Connection 객체의 참조값 얻어오기
			conn=DriverManager.getConnection(url, "acorn01", "tiger01");
			//conn=DriverManager.getConnection(url, "scott", "tiger");
			System.out.println("Oracle DB 접속 성공");
		}catch(Exception e) {
			e.printStackTrace();
		}

		//Member 테이블의 내용을 select 해서 console  에 출력해보기
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			String sql="SELECT num,name,addr FROM member ORDER BY num ASC";
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				int num=rs.getInt("num");
				String name=rs.getString("name");
				String addr=rs.getString("addr");
				System.out.println(num+"|"+name+"|"+addr);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs!=null)rs.close();
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			}catch(Exception e) {}
		}

		System.out.println("main 메소드가 종료 됩니다.");
	}
}

