package _00_intro_to_array_lists;
import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList (java.util) class
		ArrayList<String> coolStuff = new ArrayList<String>();
		//2. Add five Strings to your list
		coolStuff.add("One");
		coolStuff.add("Two");
		coolStuff.add("Three");
		coolStuff.add("Four");
		coolStuff.add("Five");
	
		//3. Print all the Strings using a standard for-loop
		for(int i = 0; i<1; i++){
			System.out.println(coolStuff);
		}
		//4. Print all the Strings using a for-each loop
		for (String string : coolStuff) {
			System.out.println(coolStuff);
		}
		//5. Print only the even numbered elements in the list.

		//6. Print all the Strings in reverse order.
		
		//7. Print only the Strings that have the letter 'e' in them.
	}
	
}
