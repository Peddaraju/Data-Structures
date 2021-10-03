import java.util.Scanner;
class M30
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		//String s1 = "btm is java";
		//             012345678910
		System.out.println("enter a line of words");
		String s1 = sc.nextLine();
		int fromIndex = s1.lastIndexOf(' ');
		int toIndex = s1.length();
		String word;
		while(fromIndex != -1)
		{
			word = s1.substring(fromIndex + 1, toIndex);
			System.out.println(word);
			toIndex = fromIndex;
			fromIndex = s1.lastIndexOf(' ', toIndex - 1);
		}
		word = s1.substring(0, toIndex);
		System.out.println(word);
	}
}
