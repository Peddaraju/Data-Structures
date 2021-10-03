/*
	M39. Write a program to check whether given two strings are anagrams?

	examples:  
	hello, llohe, elloh, ollhe, hlloe
*/
import java.util.Scanner;

class M39
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
		char c1;
		int index;
		for(int i = 0; i < s1.length(); i++)
		{
			c1 = s1.charAt(i);
			index = s2.indexOf(c1);
			if(index == -1)
			{
				return anagrams;
			}
			s2 = s2.substring(0, index) + s2.substring(index + 1); 
		}
		if(s2.length() == 0)
		{
			anagrams = true;
		}
		return anagrams;
	}
}



