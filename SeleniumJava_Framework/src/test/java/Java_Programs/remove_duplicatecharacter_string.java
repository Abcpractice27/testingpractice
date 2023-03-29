//LinkedHashSet contains a distinct element. So, if we add each character of a string into LinkedHashSet, all duplicate characters are removed.

package Java_Programs;

import java.util.LinkedHashSet;

public class remove_duplicatecharacter_string {
	
	public static void removeduplicate(String str){
		 //Create LinkedHashSet of type character
		LinkedHashSet<Character> set = new LinkedHashSet<Character>(); 
	   
		 //Add each character of the string into LinkedHashSet   
		for(int i=0; i<str.length();i++)
		{
			set.add(str.charAt(i));
		}
		
		// print the string after removing duplicate characters   
		for(Character ch:set)
		{
			System.out.print(ch);
		}
	}
	public static void main(String[] args) {
		String str = "javaTpoint is the best learning website";
		removeduplicate(str);
	}

}
