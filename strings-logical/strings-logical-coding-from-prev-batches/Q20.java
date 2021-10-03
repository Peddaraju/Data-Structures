
/*
Q20. percentages of lowercase, upper case, digits and spl chars


*/
import java.util.Scanner;
class Q20 
{
	public static void main(String[] args) 
	{
		/*
		int i = 'A';
		int j = 'Z';
		int k = 'a';
		int l = 'z';
		int m = '0';
		int n = '9';
		System.out.println("ascii codes for A-Z : " + i + " to " + j);
		System.out.println("ascii codes for a-z : " + k + " to " + l);
		System.out.println("ascii codes for 0-9 : " + m + " to " + n);
		//ascii codes for A-Z : 65 to 90
		//ascii codes for a-z : 97 to 122
		//ascii codes for 0-9 : 48 to 57		
		*/
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter string");
		String s1 = sc.nextLine();
		int lowerCasesCount = 0, upperCasesCount = 0, digitsCount = 0, splCharsCount = 0;
		int asciiValue;
		for(int i = 0; i < s1.length(); i++)
		{
			asciiValue = s1.charAt(i);
			if(asciiValue >= 65 && asciiValue <= 90)
			{
				upperCasesCount ++;
			}
			else if(asciiValue >= 97 && asciiValue <= 122)
			{
				lowerCasesCount ++;
			}
			else if(asciiValue >= 48 && asciiValue <= 57)
			{
				digitsCount ++;
			}
			else
			{
				splCharsCount ++;
			}
		}
		System.out.println("total uppercase chars:" + upperCasesCount); 		
		System.out.println("total lowercase chars:" + lowerCasesCount); 		
		System.out.println("total digits:" + digitsCount); 		
		System.out.println("total spl chars:" + splCharsCount); 		
		System.out.println("% of uppercase chars:" + ((double)upperCasesCount/s1.length()) * 100); 		
		System.out.println("% of lowercase chars:" + ((double)lowerCasesCount/s1.length()) * 100); 		
		System.out.println("% of digits:" + ((double)digitsCount/s1.length()) * 100); 		
		System.out.println("% of spl chars:" + ((double)splCharsCount/s1.length()) * 100); 		
	}
}
	 