/*
Q17. Write a java program to check whether one string is a rotation of another?

examples
1. hello  and  ohell   ==> true
2. hello  and  elloh   ==> true
3. popular  and  rpopula   ===> true
3. popular  and  opularp   ===> true


*/
import java.util.Scanner;

class Q17
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first string");
		String s1 = sc.next();
		System.out.println("enter 2nd string");
		String s2 = sc.next();
		boolean flag = s1.equals(s2.charAt(s2.length() - 1) + s2.substring(0, s2.length() - 1)) ||
					   s1.equals(s2.substring(1) + s2.charAt(0));
					   
		System.out.println(flag);
	}
}











