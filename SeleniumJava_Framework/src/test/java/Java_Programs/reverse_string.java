package Java_Programs;

import java.util.Scanner;

public class reverse_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String str;
//		Scanner in = new Scanner(System.in);
//		System.out.println("Enter your string");
//		str = in.nextLine();
//		String[] token = str.split("");
//		for(int i=token.length-1; i>=0; i--)
//		{
//			System.out.print(token[i] + "");
//		}
		String str;
		Scanner in = new Scanner(System.in);
		System.out.println("ENTER YOUR STRING");
		str= in.nextLine();
		String[] revstr = str.split("");
		for(int i=revstr.length-1; i>=0; i--)
		{
			System.out.print(revstr[i] + "");
		}
	}

}

