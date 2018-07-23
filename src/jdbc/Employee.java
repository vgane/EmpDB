package jdbc;

//POJO class-Plain old java object
public class Employee {
	
	private Integer empno;
	private String ename;
	private Float sal;
	
	
	
	//create constructor
	public Employee() {	}
	public Employee(Integer empno, String ename, Float sal) {
		this.empno=empno;
		this.ename=ename;
		this.sal=sal;

	}
	@Override //source, generate toString 
	public String toString() {
		return "Employee [empno=" + empno + ", ename=" + ename + ", sal=" + sal + "]";
	}
	//source generate getters and setters
	public Integer getEmpno() {
		return empno;
	}
	public void setEmpno(Integer empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public Float getSal() {
		return sal;
	}
	public void setSal(Float sal) {
		this.sal = sal;
	}
	

}
