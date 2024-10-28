package pets;

import java.util.Date;

import finaljavaproject.Animal;

public class Dog extends Animal {
    
    public Dog(int id, String name, String type, int birthDate) {
        super(id, name, type, birthDate);
    }
    
    public void bark() {
        System.out.println("bark");
    }
    
    public void sit() {
        System.out.println("sit");
    }
    
    public void roll() {
        System.out.println("roll");
    }
    
}