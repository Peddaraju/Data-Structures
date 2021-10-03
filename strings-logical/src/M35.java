import java.util.Scanner;
class M35
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		//String s1 = "btm,abc is,java hello,123";
		  String s1 = "ja,va. ;,123.; xyz";
		//             012345678910
		System.out.println("enter a line of words");
		String s1 = sc.nextLine();
		int fromIndex = 0;
		int spaceIndex = s1.indexOf(' ');  //6
		int commaIndex = s1.indexOf(',');  //2
		int semiColonIndex = s1.indexOf(';'); //7
		int dotIndex = s1.indexOf('.'); //5
		int toIndex = findMinAmong(spaceIndex, commaIndex, semiColonIndex, dotIndex); //2		
		String word;
		while(toIndex != -1)
		{
			word = s1.substring(fromIndex, toIndex); //(0, 2)
			System.out.println(word); //ja, va
			toIndex = trimLeadingDelims(s1, toIndex); //2, 8
			fromIndex = toIndex + 1; //3, 9
			spaceIndex = s1.indexOf(' ', fromIndex); //6
			commaIndex = s1.indexOf(',', fromIndex);  //8
			semiColonIndex = s1.indexOf(';', fromIndex); //7
			dotIndex = s1.indexOf('.', fromIndex); //5
			toIndex = findMinAmong(spaceIndex, commaIndex, semiColonIndex, dotIndex); //5
		}
		word = s1.substring(fromIndex);
		System.out.println(word);
	}
	static int findMinAmong(int commaIndex, int semiColonIndex, int dotIndex, int spaceIndex)
	{
		int[] numbers = {commaIndex, semiColonIndex, dotIndex, spaceIndex};
		int min = -1;
		for(int i = 0; i< numbers.length; i++)
		{
			if(min == -1)
			{
				if(numbers[i] != -1)
				{
					min = numbers[i];
				}
			}
			else if(numbers[i] != -1 && numbers[i] < min)
			{
				min = numbers[i];
			}
		}
		return min;
	}
	static int trimLeadingDelims(String s1, int toIndex)
	{
		char c1 = s1.charAt(toIndex + 1);
		while(c1 == ' ' || c1 == '.' || c1 == ';' || c1 == ',')
		{
			++toIndex;
			c1 = s1.charAt(toIndex + 1);
		}
		return toIndex;
	}
}
