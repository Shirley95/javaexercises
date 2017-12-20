import java.util.HashMap;
import java.util.Scanner;

public class Logic {
	
	
	private HashMap<String, String> morseCode = new HashMap<>();
	private String[] split;
	private String entry = "";
	
	public void morseToLetter() {
	HashMapMorseCode m = new HashMapMorseCode();
	m.setUpHashMap(morseCode);
			
	Scanner userInput = new Scanner(System.in);
	System.out.println("Please Enter Morse Code. Use a / for a space between words in the "
			+ "\ntranslation. Also use a space when entering Morse code to seperate characters.");
	entry = userInput.nextLine();
	split = entry.split(" ");
	
	for(int i = 0; i < split.length; i++) {
		System.out.print(morseCode.get(split[i]));
	}
	
	
	userInput.close();
	}

	public void letterToMorse() {
		
		HashMapMorseCode m = new HashMapMorseCode();
		m.setUpHashMap(morseCode);
		
		Scanner userInput = new Scanner(System.in);
		System.out.println("Please enter a word");
		entry = userInput.nextLine();
		char c;
		String s = "";
		
		for(int i = 0; i < entry.length(); i++) {
			
			c = entry.charAt(i);
			
			System.out.println(getKeyFromValue(morseCode, s.valueOf(c)));
			
		}
		userInput.close();
	}
	
	
	public Object getKeyFromValue ( HashMap<String, String>hm, Object value) {
		
	
		for(Object o: hm.keySet()) {
			if(hm.get(o).equals(value)) {
				return o;
			}
			
		}
		
		
		return null;
	}
	
	
	
	
	
}
