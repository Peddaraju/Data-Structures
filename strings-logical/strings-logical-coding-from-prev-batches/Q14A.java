/*
	Q14. Write a program to check whether given two strings are anagrams?

	examples:  
	hello, llohe, elloh, ollhe, hlloe
*/
import java.util.Scanner;

class Q14A 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first string");
		String s1 = sc.next();
		System.out.println("enter 2nd string");
		String s2 = sc.next();
		boolean anagrams = checkAnagrams(s1, s2);
		if(anagrams)
		{
			System.out.println(s1 + " and " + s2 + " both are anagrams");
		}
		else
		{
			System.out.println(s1 + " and " + s2 + " both are not anagrams");
		}
	}
	private static boolean checkAnagrams(String s1, String s2)
	{
		boolean anagrams = false;
		if(s1.length() != s2.length())
		{
			return anagrams;
		}
		s1 = sort(s1);
		s2 = sort(s2);
		if(s1.equals(s2))
		{
			anagrams = true;
		}
		return anagrams;
	}
	private static String sort(String s1)
	{
		/*
		char[] chars = s1.toCharArray();
		java.util.Arrays.sort(chars);
		return new String(chars);
		*/
		char[] chars = s1.toCharArray();		
		for(int i = 0; i < chars.length; i++)
		{
			for(int j = 0; j < chars.length - 1 - i; j++)
			{
				if(chars[j] > chars[j + 1])
				{
					char temp = chars[j];
					 chars[j] = chars[j + 1];
					 chars[j + 1] = temp;
				}
			}
		}
		return new String(chars);
	}
}



