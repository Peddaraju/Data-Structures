/*
Q18. reverse a string word wise

examples
1. test hello 
   hello test

2. a hello 
   hello a

3. test a
   a test


4. a abc hello
   hello abc a


*/
import java.util.Scanner;

class Q19
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first string");
		String s1 = sc.nextLine();
		String s2 = reverse(s1);
		System.out.println(s2);
	}
	static String reverse(String s1)
	{
		if(s1.lastIndexOf(' ') == -1)
		{
			return s1;
		}
		return s1.substring(s1.lastIndexOf(' ') + 1) + ' ' + reverse(s1.substring(0, s1.lastIndexOf(' '))); 
	}
}











