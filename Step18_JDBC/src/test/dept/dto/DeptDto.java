package test.dept.dto;

public class DeptDto {
	//필드
	private int deptno;
	private String dname;
	private String loc;
	//디폴트생성자
	public DeptDto() {}
	
	public DeptDto(int deptno, String dname, String loc) {
		super();
		this.deptno=deptno;
		this.dname=dname;
		this.loc=loc;
	}

	public int getDeptno() {
		return deptno;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}
	
	
}
