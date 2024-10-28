package finaljavaproject.Actions;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import finaljavaproject.DatabaseConnection;

public class NewCommand {
	
	public static void addNewCommand() {
	    Scanner scanner = new Scanner(System.in);

	    System.out.print("Enter animal ID: ");
	    int animalId = scanner.nextInt();
	    scanner.nextLine();

	    System.out.print("Enter new command: ");
	    String command = scanner.nextLine();

	    String query = "INSERT INTO Commands (animal_id, command) VALUES (?, ?)";

	    try (Connection conn = DatabaseConnection.getConnection();
	         PreparedStatement pstmt = conn.prepareStatement(query)) {

	        pstmt.setInt(1, animalId);
	        pstmt.setString(2, command);
	        pstmt.executeUpdate();

	        System.out.println("Command added successfully!");
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	}

}
