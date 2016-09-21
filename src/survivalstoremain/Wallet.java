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
	 //public List<Products> prod = new ArrayList<Products>();
	SurvivalDAOImpl impl = new SurvivalDAOImpl();
	private String walletTotal;

	public  void WalletInter() throws SQLException {
		String sql = null;
		ResultSet rs = null;
			try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (Exception ex) {

			}
		 Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/"
					+ "products?autoReconnect=true&useSSL=false",
					"robert", "robert");
		
		 sql = ("SELECT wallet_total FROM customer");
			PreparedStatement statement = conn.prepareStatement(sql);
			rs = statement.executeQuery();
		while (rs.next()){
			
			System.out.println(rs.getString("wallet_total"));
		}
		conn.close();

	}
		
		
	}		

