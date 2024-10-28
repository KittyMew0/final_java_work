package finaljavaproject.Actions;

import java.sql.*;
import java.util.Scanner;

public class CreatingAnimal {
	public void createAnimal() {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter animal ID: ");
        int id = scanner.nextInt();
        System.out.print("Enter animal name: ");
        String name = scanner.next();
        System.out.print("Enter animal type: ");
        String type = scanner.next();
        System.out.print("Enter animal date birth in yyyyMMdd format: ");
        int birthDate = scanner.nextInt();

        Animal animal = new Animal(id, name, type, birthDate);


        try (Connection connection = DriverManager.getConnection("jdbc:mysql://your_host:3306/check_it", "your_user", "your_password")) {
            String sql = "INSERT INTO " + type + " (id, name, type, age) VALUES (ID, Name, Type, Age)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, animal.getId());
            statement.setString(2, animal.getName());

            statement.executeUpdate();
            System.out.println("Animal added successfully!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        scanner.close();
	}
}