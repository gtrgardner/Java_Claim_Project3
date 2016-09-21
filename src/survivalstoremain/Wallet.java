package survivalstoremain;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;

public class Wallet{
	 
	SurvivalDAOImpl impl = new SurvivalDAOImpl();
	
	public  void WalletInter() throws SQLException {
		String sql = null;
		ResultSet rs = null;
		Connection conn = impl.getConnection();
			
		 sql = ("SELECT wallet_total FROM customer");
			PreparedStatement statement = conn.prepareStatement(sql);
			rs = statement.executeQuery();
		while (rs.next()){
			
			System.out.println(rs.getString("wallet_total"));
		}
		conn.close();

	}
		
		
	}		

