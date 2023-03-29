
public class duplicatecharacter_string {
	
	public static void main(String[] args) {
	String s = "Hello Pooja ";
	int count = 0;
	char ch[] = s.toCharArray();
	System.out.println("Duplicate character are:");
	for(int i=0; i<=s.length(); i++)
	{
		for(int j=i+1; j<s.length(); j++)
		{
			if(ch[i]==ch[j])
			System.out.println(ch[j]);
			count++;
			break;
		}
	}
	}
}
