package survivalstoremain;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
//import java.util.Scanner;

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

	public List<Products> ListBy(int sort) {

		String sql = null;

		if (sort == 1) {
			sql = ("SELECT * FROM inventory");
		} else if (sort == 2) {
			sql = ("SELECT * FROM inventory ORDER BY category ASC");
		} else if (sort == 3) {
			sql = ("SELECT * FROM inventory ORDER BY name ASC");
		} else if (sort == 4) {
			sql = ("SELECT * FROM inventory ORDER BY price DESC");
		} else {
			// SurvivalStoreMain.UserInterface();
		}

		List<Products> result = new ArrayList<Products>();

		Connection conn = null;
		ResultSet rs = null;

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
