import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Anagram {

	public static void main(String[] args) {
		System.out.println("Enter the first strings ");
		Scanner sc = new Scanner(System.in);
		
		String s1 = sc.nextLine();
		System.out.println("Enter the second strings ");
		String s2 = sc.nextLine();
		
		if(!isAnagram(s1,s2)) {
			System.out.println("The two strings entered are anagrams of each other");
		} else {
			System.out.println("The two strings entered are not anagrams of each other");
		}		
	}
	
	public static boolean isAnagram(String input1, String input2) {
		if(input1.length() != input2.length()) {
			return false;
		}
		Map<Character, Integer> characterFrequencyCounter = new HashMap<>();
		for(Character c : input1.toCharArray()) {
			if(c ==' ') {
				continue;
			}
			if(characterFrequencyCounter.containsKey(c)) {
				characterFrequencyCounter.put(c, characterFrequencyCounter.get(c) +1);
			} else {
				characterFrequencyCounter.put(c,1);
			}
		}
		
		for(Character c : input2.toCharArray()) {
			if(c ==' ') {
				continue;
			}
			if(characterFrequencyCounter.containsKey(c)) {
				characterFrequencyCounter.put(c, characterFrequencyCounter.get(c) - 1);
			} else {
				return false;
			}
		}
		
		for(Map.Entry<Character, Integer> e : characterFrequencyCounter.entrySet()) {
			if(e.getValue() != 0) {
				return false;
			}
		}
		return true;
	}
		

}
