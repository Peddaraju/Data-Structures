import java.util.Scanner;
class M34
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		//String s1 = "bt i  xy   t                         123";
		//             012345678910
		System.out.println("enter a line of words");
		String s1 = sc.nextLine();
		int fromIndex = 0;
		int toIndex = s1.indexOf(' '); 
		String word;
		while(toIndex != -1)
		{
			word = s1.substring(fromIndex, toIndex);
			System.out.println(word); 
			toIndex = checkNextChar(s1, toIndex); 
			fromIndex = toIndex + 1;  
			toIndex = s1.indexOf(' ', fromIndex); 
		}
		word = s1.substring(fromIndex);
		System.out.println(word);
	}
	static int checkNextChar(String s1, int toIndex) 
	{
		char c1 = s1.charAt(toIndex + 1);
		while(c1 == ' ')
		{
			++toIndex;
			c1 = s1.charAt(toIndex + 1);
		}
		return toIndex;
	}
}
