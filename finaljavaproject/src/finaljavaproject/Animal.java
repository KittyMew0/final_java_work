package finaljavaproject;

public class Animal {
	private int id;
	private String name;
	private String type;
	private int birthDate;
	
	public Animal(int id, String name, String type, int birthDate) {
		this.id = id;
		this.name = name;
		this.type = type;
		this.birthDate = birthDate;
	}
	
	public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getName() {
        return name;   

    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    public int getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(int birthDate) {
        this.birthDate = birthDate;
    }
	
}
