package pets;

import java.util.Date;

import finaljavaproject.Animal;

public class Hamster extends Animal {
    
    public Hamster(int id, String name, String type, int birthDate) {
        super(id, name, type, birthDate);
    }
    
    public void roll() {
        System.out.println("roll");
    }
    
    public void spin() {
        System.out.println("spin");
    }
    
}