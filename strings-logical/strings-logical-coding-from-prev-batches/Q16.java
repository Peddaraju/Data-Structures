/*
Q16. Write a java program to find duplicate characters in a string?
examples

*/
import java.util.Scanner;

class Q16
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string");
		String s1 = sc.next();
		char[] chars = s1.toCharArray();
		for(int i = 0; i < chars.length; i++)
		{
			for(int j = 0; j < chars.length - i - 1; j++)
			{
				if(chars[j] > chars[j + 1])
				{
					char temp = chars[j];
					chars[j] = chars[j + 1];
					chars[j + 1] = temp;
				}
			}
		}
		System.out.println(java.util.Arrays.toString(chars));
		int charCount = 1;
		char prevChar = chars[0];
		for(int i = 1; i < chars.length; i++)
		{
			if(prevChar == chars[i])
			{
				charCount ++;
			}
			else
			{
				System.out.println(prevChar + ":" + charCount);
				charCount = 1;
				prevChar = chars[i];
			}
		}
		System.out.println(prevChar + ":" + charCount);
	}
}











