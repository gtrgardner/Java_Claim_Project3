package survivalstoremain;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SurvivalDAOImpl {

	static {
		try {

			Class.forName("com.mysql.jdbc.Driver");

		} catch (Exception ex) {

		}
	}

	// Establish connection
	private Connection getConnection() throws SQLException {

		return DriverManager.getConnection("jdbc:mysql://localhost:3306/" + "products?autoReconnect=true&useSSL=false",
				"robert", "robert");

	}

	private void closeConnection(Connection conn) {

		if (conn == null) {
			return;
		}
		try {
			conn.close();
		} catch (SQLException ex) {

		}

	}

	public List<Products> findAllProducts() {

		List<Products> result = new ArrayList<Products>();

		Connection conn = null;
		ResultSet rs = null;
		String sql = ("SELECT * FROM inventory");
		try {
			conn = getConnection();
			PreparedStatement statement = conn.prepareStatement(sql);
			rs = statement.executeQuery();

			while (rs.next()) {
				Products cat = new Products();
				cat.setId(rs.getInt("id"));
				cat.setCategory(rs.getString("category"));
				cat.setName(rs.getString("name"));
				cat.setPrice(rs.getFloat("price"));
				cat.setNum_in_stock(rs.getInt("num_in_stock"));

				result.add(cat);

			}
		} catch (SQLException ex) {

		} finally {

			closeConnection(conn);

		}

		return result;

	}

	public List<Products> ListBy() {
		
		int sort = 0;
		String sql = null;
		
		System.out.println("List Products by:");
		System.out.println("1 Category:");
		System.out.println("2 Name:");
		System.out.println("3 Price");
		System.out.println("Return to Main Menu:");
		
		if (sort == 1){
			sql = ("SELECT * FROM inventory ORDER BY category ASC");	
		}else if (sort == 2){
			sql = ("SELECT * FROM inventory ORDER BY name ASC");
		}else if (sort == 3){
			sql = ("SELECT * FROM inventory ORDER BY price DESC");
		}else{
			
		}

		List<Products> result = new ArrayList<Products>();

		Connection conn = null;
		ResultSet rs = null;
		//String sql = ("SELECT * FROM inventory ORDER BY category ASC");
		try {
			conn = getConnection();
			PreparedStatement statement = conn.prepareStatement(sql);
			rs = statement.executeQuery();

			while (rs.next()) {
				Products cat = new Products();
				cat.setId(rs.getInt("id"));
				cat.setCategory(rs.getString("category"));
				cat.setName(rs.getString("name"));
				cat.setPrice(rs.getFloat("price"));
				cat.setNum_in_stock(rs.getInt("num_in_stock"));

				result.add(cat);
			}
		} catch (SQLException ex) {

		} finally {

			closeConnection(conn);

		}

		return result;

	}

}
