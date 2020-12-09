package test.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import test.member.dto.MemberDto;
import test.util.DBConnect;

/*
 * member 테이블에 있는 회원 목록을 SELECT하고 
 * num에 대해서 오름차순 정렬을 해서
 * List<MemberDto> 형태로 만들어 보세요.
 */
public class MainClass08 {
	public static void main(String[] args) {
		List<MemberDto> list=new ArrayList<>();
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		
		try {
			conn=new DBConnect().getConn();
			String sql="SELECT*FROM member ORDER BY num ASC";
			pstmt=conn.prepareStatement(sql);
			// ? 가 없으므로 바인딩할 내용도 없다.
			rs=pstmt.executeQuery();
			
			while(rs.next()) {//반복문 돌면서 커서를 한칸씩 내린다.
				//커서가 위치한 곳의 데이터를 읽어와서 MemberDto 객체를 생성해서 담고
				MemberDto dto=new MemberDto();
				dto.setNum(rs.getInt("num"));
				dto.setName(rs.getString("name"));
				dto.setAddr(rs.getString("addr"));
				//생성된 MemberDto 객체의 참조값을 ArrayList 객체에 누적 시킨다.
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
		//위의 코드를 수행한후의 배열의 방의 갯수 참조해 보기
		int size=list.size();
		//showInfo() 메소드에 List의 참조값 전달해 보기
		showInfo(list);
		System.out.println("main 메소드가 종료됩니다.");
	}
	public static void showInfo(List<MemberDto> list) {
		for(MemberDto tmp:list) {
			System.out.println(tmp.getNum()+"|"+tmp.getName()+
			"|"+tmp.getAddr());
		}
	}

}
