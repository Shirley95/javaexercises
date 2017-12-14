package intermediate;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;

public class WorkingWithFiles {
	public ArrayList<Person> peopleInfo = new ArrayList<Person>();

	public WorkingWithFiles() {
		// TODO Auto-generated constructor stub
		super();
		this.peopleInfo.add(new Person("Jane", "Banker", 40));
		this.peopleInfo.add(new Person("Bob", "Engineer", 28));
		this.peopleInfo.add(new Person("Fred", "Teacher", 30));
		this.peopleInfo.add(new Person("Tiffany", "Professional Dancer", 25));
		this.peopleInfo.add(new Person("Olivia", "Actress", 19));
	}

	public void writeFile() {
		File newFile = new File("/Users/shirleyyang/Desktop/newFile.txt");

		try {
			newFile.createNewFile();
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			// create new file write --> to convert file so buffered writer can handle
			FileWriter fileW = new FileWriter(newFile);
			BufferedWriter buffWrite = new BufferedWriter(fileW);
			for (Person person : peopleInfo) {
				// formatting the peopleInfo for easy retrieval
				// append + flush = write
				buffWrite.append(person.getName() + ", " + person.getOccupation() + ", " + person.getAge() + "\n");
			}
			buffWrite.flush();
			buffWrite.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public ArrayList<Person> readFile() {
		ArrayList<Person> newArrayList = new ArrayList<Person>();
		File newFile = new File("/Users/shirleyyang/Desktop/newFile.txt");
		try {
			FileReader fileR = new FileReader(newFile);
			BufferedReader buffR = new BufferedReader(fileR);

			String input;

			// when there is a line, readLine will return a string and when it is at the end
			// it will return null
			while ((input = buffR.readLine()) != null) {
				String[] retrieveInfo = input.split(", "); // each loop will contain splitted strings into the string
															// array
				Person p = new Person(retrieveInfo[0], retrieveInfo[1], Integer.parseInt(retrieveInfo[2])); // make new
																											// person
																											// out of
																											// string
				newArrayList.add(p); // add person to array
			}

			buffR.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return newArrayList;
	}

}
