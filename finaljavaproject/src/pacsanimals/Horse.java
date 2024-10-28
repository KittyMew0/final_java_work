package pacsanimals;

import java.util.Date;

import finaljavaproject.Animal;

public class Horse extends Animal {
    
    public Horse(int id, String name, String type, int birthDate) {
        super(id, name, type, birthDate);
    }
    
    public void trot() {
        System.out.println("trot");
    }
    
    public void canter() {
        System.out.println("canter");
    }
    
    public void gallop() {
        System.out.println("gallop");
    }
    
}