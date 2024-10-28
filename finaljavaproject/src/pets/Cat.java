package pets;

import java.util.Date;

import finaljavaproject.Animal;

public class Cat extends Animal {
    
    public Cat(int id, String name, String type, int birthDate) {
        super(id, name, type, birthDate);
    }
    
    public void meow() {
        System.out.println("meow");
    }
    
    public void scratch() {
        System.out.println("scratch");
    }
    
    public void jump() {
        System.out.println("jump");
    }
    
}