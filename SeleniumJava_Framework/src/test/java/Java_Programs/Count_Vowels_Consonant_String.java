package Java_Programs;

import java.util.Scanner;

public class Count_Vowels_Consonant_String {

	public static boolean isVowels(char ch)
	{
		if(ch == 'a' || ch =='e' || ch =='i' || ch =='o' || ch =='u')
        return true;
        
        return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		 int vowelCount = 0;
	     int consCount = 0;
	     
	     for(int i=0;i<str.length();i++) {
	            char ch = str.charAt(i);
	            if(isVowels(ch) == true) 
	            	vowelCount++;
	            else if(ch >='a' && ch<='z' && isVowels(ch) == false) 
	            	consCount++;
	        }

	        System.out.println("Number of vowels are: " + vowelCount);
	        System.out.println("Number of consonants are: " + consCount);
	        System.out.println("Number of other characters are: " + (int)(str.length() - vowelCount -consCount));
		}
	}


