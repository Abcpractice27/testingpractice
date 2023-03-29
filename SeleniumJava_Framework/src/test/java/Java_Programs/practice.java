package Java_Programs;

import java.util.HashMap;
import java.util.LinkedHashSet;

public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		//Rverse string program
//		String s = "Pooja";
//		char[] ch = s.toCharArray();
//		for(int i=ch.length-1; i>=0; i--)
//		{
//			System.out.print(ch[i]);
//		}
		
		//swapping of two numbers 
//		int a = 20;
//		int b = 30;
//		int c;
//		a = a+b; 
//		b = a-b;
//		a = a-b;
//		System.out.println( "a" + a);
//		System.out.println("b"  + b);
		
		//remove the duplicate character from string
//		String str = "hello world";
//		LinkedHashSet<Character> ch = new LinkedHashSet<Character>();
//		for(int i=0; i<str.length(); i++)
//		{
//			ch.add(str.charAt(i));
//		}
//		for(Character abc: ch)
//		{
//		System.out.print(abc);
//		}
		
		//check whether the string is palindrome or not
		String original ="pop";
		String reverse = "";
		int len = original.length();
		for(int i=len-1; i>=0; i--)
		{
			reverse = reverse + original.charAt(i);
		}
		if(original.equals(reverse))
			System.out.println("the string is palindrome");
		else
			System.out.println("the string is not palindrome");
		
		
		
	}

}
