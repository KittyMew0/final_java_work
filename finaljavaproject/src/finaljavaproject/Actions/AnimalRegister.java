package finaljavaproject.Actions;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import finaljavaproject.DatabaseConnection;

public class AnimalRegister {

    public static void monitorAnimals() {
        String query = "SELECT * FROM Pets UNION SELECT * FROM PackAnimals";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(query);
             ResultSet rs = pstmt.executeQuery()) {

            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id") +
                                   ", Name: " + rs.getString("name") +
                                   ", Birth Date: " + rs.getDate("birth_date"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
