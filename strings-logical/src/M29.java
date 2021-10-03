import java.util.Scanner;
class M29
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		//String s1 = "btm is java";
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
			fromIndex = toIndex + 1;
			toIndex = s1.indexOf(' ', fromIndex);
		}
		word = s1.substring(fromIndex);
		System.out.println(word);
	}
}
