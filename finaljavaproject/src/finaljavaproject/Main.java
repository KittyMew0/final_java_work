package finaljavaproject;

import java.util.Scanner;
import finaljavaproject.Actions.AnimalRegister;
import finaljavaproject.Actions.Commands;
import finaljavaproject.Actions.CreatingAnimal;
import finaljavaproject.Actions.NewCommand;
import finaljavaproject.Actions.Sorting;

public class Main {
	public static void main(String[] args) {
		
        //main menu
		int option = 0;
		int counter = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Hi, welcome to animal register!");
		System.out.println("Here you can:");
		do {
			System.out.println("1. Monitor your animals \n"
					+ "2. Add new ones \n"
					+ "3. See their commands \n"
					+ "4. Add new commands \n"
					+ "5. Sort by birth date \n"
					+ "6. Note how many you've been added already \n"
					+ "7. Exit the program \n"
					+ "\n"
					+ "Just pick an option and follow the instructions");
			option = sc.nextInt();
			
			//commands
			switch(option) {
			case 1:
				monitorAnimals();
				break;
			case 2:
				createAnimal();
				counter++;
				break;
			case 3:
				seeAnimalCommands();
				break;
			case 4:
				addNewCommand();
				break;
			case 5:
				sortByBirthDate();
				break;
			case 6:
				System.out.println("You've been added " + counter + " already");
				break;
			case 7:
				System.exit(0);
			default:
				return;
			}
		} while (option != 7);		
		
	}
}
