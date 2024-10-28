package pacsanimals;

import java.util.Date;

import finaljavaproject.Animal;

public class Donkey extends Animal {
    
    public Dokey(int id, String name, String type, int birthDate) {
        super(id, name, type, birthDate);
    }
    
    public void walk() {
        System.out.println("walk");
    }
    
    public void carryLoad() {
        System.out.println("carry load");
    }
    
    public void bray() {
        System.out.println("bray");
    }
    
}