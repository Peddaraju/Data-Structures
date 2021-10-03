//reverse a string in the specified portion.
import java.util.Scanner;
class M15
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string");
		String s1 = sc.next();
		System.out.println("from which index reverse should start?");
		int start = sc.nextInt();
		System.out.println("till to which index reverse should continue?");
		int end = sc.nextInt();
		char[] chars = s1.toCharArray();
		for(int i = start; i <= (start + ((end - start) / 2)); i++)
		{
			char temp =  chars[i];
			chars[i] = chars[end + start - i];
			chars[end + start - i] = temp;
		}
		String s2 = new String(chars);
		System.out.println(s1);
		System.out.println(s2);
	}
}
