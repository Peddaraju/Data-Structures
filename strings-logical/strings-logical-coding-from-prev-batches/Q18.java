/*
Q18. . Write a java program to reverse a given string with preserving the position of spaces?

examples
1. test hello 
   olle htset

2. a hello 
   o lleha

3. test a
   atse t


4. a abc hello
   o lle hcbaa


*/
import java.util.Scanner;

class Q18
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first string");
		String s1 = sc.nextLine();
		String s2 = "";
		for(int i = s1.length() - 1, j = 0; i >= 0; i--, j++)
		{
			if(s1.charAt(j) == ' ')
			{
				s2 += ' ';
				i++;
				continue;
			}
	
			if(s1.charAt(i) != ' ')
			{
				s2 += s1.charAt(i);
			}
			else
			{
				j--;
			}
		}
		/*  a abc hello
		    012345678910
			i = 10
			j = 0
			s2 = o
			---
		
			
			
			i = 9
			j = 2
			s2 = o_l
			
			
			---

			i = 8
			j = 3
			s2 = o_ll
			---
			a abc hello
		    012345678910
			i = 7
			j = 4
			s2 = o_lle
			----------

			a abc hello
		    012345678910
			i = 6
			j = 6
			s2 = o_lle_h
			----------
			a abc hello
		    012345678910
			i = 5
			j = 6
			s2 = o_lle_h
			----------
			a abc hello
		    012345678910
			i = 4
			j = 7
			s2 = o_lle_hc
			----------
			a abc hello
		    012345678910
			i = 3
			j = 8
			s2 = o_lle_hcb
			----------
			a abc hello
		    012345678910
			i = 2
			j = 9
			s2 = o_lle_hcba
			----------			----------
			a abc hello
		    012345678910
			i = 1
			j = 9
			s2 = o_lle_hcba
			----------
			a abc hello
		    012345678910
			i = 0
			j = 10
			s2 = o_lle_hcbaa
			----------

		*/






		System.out.println(s2);
	}
}











