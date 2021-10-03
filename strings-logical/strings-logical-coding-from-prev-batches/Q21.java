
/*
Q21. find out longest substring without repeating chars.

case1
-----
		src : abctbrunrpm
			  abct, ctbrun, unrpm


*/
import java.util.Scanner;
class Q21
{
	public static void main(String[] args) throws Exception 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter string");
		String s1 = sc.nextLine();
		String substring = "";
		int start = 0;
		boolean newStart = false;
		String largetSubstring = "";
		System.out.println("available substrings:");
		for(int i = 0; i < s1.length(); i++)
		{
			for(int j = start; j < i; j++)
			{
				if(s1.charAt(i) == s1.charAt(j))
				{
					System.out.println(substring);
					if(substring.length() > largetSubstring.length())
					{
						largetSubstring = substring;
					}
					substring = "";
					i = j;
					start = j + 1;
					newStart = true;
					break;
				}
			}
			if(newStart)
			{
				newStart = false;
				continue;
			}
			substring = substring + s1.charAt(i);
		}
		System.out.println(substring); 		
		System.out.println("Largest Substring: " + largetSubstring); 		
	}
}
	 