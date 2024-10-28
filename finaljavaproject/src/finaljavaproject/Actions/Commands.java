package finaljavaproject.Actions;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import finaljavaproject.DatabaseConnection;

public class Commands {
	public static void seeCommands() {
	    String query = "SELECT a.name, c.command FROM Pets a JOIN Commands c ON a.id = c.animal_id UNION " +
	                   "SELECT a.name, c.command FROM PackAnimals a JOIN Commands c ON a.id = c.animal_id";

	    try (Connection conn = DatabaseConnection.getConnection();
	         PreparedStatement pstmt = conn.prepareStatement(query);
	         ResultSet rs = pstmt.executeQuery()) {

	        while (rs.next()) {
	            System.out.println("Animal: " + rs.getString("name") +
	                               ", Command: " + rs.getString("command"));
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	}

}
