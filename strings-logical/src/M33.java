import java.util.Scanner;
class M33
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		//String s1 = "btm,abc is,java hello,123";
		//             012345678910
		System.out.println("enter a line of words");
		String s1 = sc.nextLine();
		int fromIndex = 0;
		int spaceIndex = s1.indexOf(' '); 
		int commaIndex = s1.indexOf(','); 
		int toIndex = nextIndex(spaceIndex, commaIndex);
		String word;
		while(toIndex != -1)
		{
			word = s1.substring(fromIndex, toIndex);
			System.out.println(word);
			fromIndex = toIndex + 1;
			spaceIndex = s1.indexOf(' ', fromIndex); 
			commaIndex = s1.indexOf(',', fromIndex); 
			toIndex = nextIndex(spaceIndex, commaIndex);
		}
		word = s1.substring(fromIndex);
		System.out.println(word);
	}
	static int nextIndex(int spaceIndex, int commaIndex)
	{
		int toIndex = 0;
		if(spaceIndex == -1 && commaIndex == -1)
		{
			toIndex = -1;
		}
		else if(spaceIndex == -1 && commaIndex != -1)
		{
			toIndex = commaIndex;
		}
		else if(commaIndex == -1 && spaceIndex != -1)
		{
			toIndex = spaceIndex;
		}		
		else if(commaIndex > spaceIndex)
		{
			toIndex = spaceIndex;
		}		
		else
		{
			toIndex = commaIndex;
		}
		return toIndex;
	}
}
