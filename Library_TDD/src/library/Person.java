package library;

public class Person {
	
	private String name;
	private int age;
	private int ID;
	
	public Person(String name, int age, int iD) {
		super();
		this.name = name;
		this.age = age;
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {  
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", ID=" + ID + "]";
	}
	
	
	
}
