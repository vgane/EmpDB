package jdbc;

import java.sql.ResultSet;

public interface DAOLoginInterface {
	void saveLogin(LoginUser info) throws Exception;
		void updateLogin(LoginUser info) throws Exception;
		void deleteLogin(String uname) throws Exception;
		int selectLogin(LoginUser info) throws Exception;
}
