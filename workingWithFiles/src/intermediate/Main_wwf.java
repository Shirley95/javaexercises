package intermediate;


public class Main_wwf {

	public static void main(String[] args) {
		WorkingWithFiles writeFile = new WorkingWithFiles();
		// create new file variable
		// because created new object from WorkingWithFiles class therefore want to access methods inside will need to use object.methodname
		// call from/via object writeFile
		System.out.println(writeFile.readFile());

	}

}
