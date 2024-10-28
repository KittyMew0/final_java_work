package finaljavaproject.Actions;

public class Sorting {
	public static void sortByBirthDate() {
	    String query = "SELECT * FROM Pets UNION SELECT * FROM PackAnimals ORDER BY birth_date";

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
