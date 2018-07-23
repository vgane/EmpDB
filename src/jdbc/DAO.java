package jdbc;

public interface DAO {
	 void saveEmp(Employee emp) throws Exception;
	void updateEmp(Employee emp) throws Exception;
	void deleteEmp(int eno) throws Exception;
	
}
