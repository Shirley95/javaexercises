package intermediate;

public class Person {
	
	private String Name;
	private String Occupation;
	private int Age;
	
	public String getName() {
		return Name;
	}

	public String getOccupation() {
		return Occupation;
	}

	public int getAge() {
		return Age;
	}

	public Person(String name, String occupation, int age) {
		super();
		Name = name;
		Occupation = occupation;
		Age = age;
	}

	@Override
	public String toString() {
		return "Person [Name=" + Name + ", Occupation=" + Occupation + ", Age=" + Age + "]";
	}
	
	

}
