
import java.util.Scanner;

/*
 which ever word of 2nd input available in the 1st input, yhen that word should be retained as it is 
 and other words should be reversed
 */
public class M37 {
	public static void main(String[] args) {
		//String s1 = "hello test abc xyz java btm my name is vijay";
		//String s2 = "abc, my, xyz, is, java";
		// out put should be : olleh tset abc xyz java mtb my emna is yajiv";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first input");
		String s1 = sc.nextLine();
		System.out.println("enter 2nd input");
		String s2 = sc.nextLine();
		
		String[] words = s2.split(",");
		String currentWord = null;
		boolean flag = true;
		int startIndex = 0, endIndex = s1.indexOf(' ');
		while(endIndex != -1)
		{
			currentWord = s1.substring(startIndex, endIndex);
			for(String word : words)
			{
				if(currentWord.trim().equals(word.trim()))
				{
					 flag = false;
					 break;
				}
			}
			if(flag)
			{
				s1 = s1.substring(0, startIndex) + reverse(s1.substring(startIndex, endIndex)) + s1.substring(endIndex);
			}
			flag = true;
			startIndex = endIndex + 1;
			endIndex = s1.indexOf(' ', startIndex);
		}
		currentWord = s1.substring(startIndex);
		for(String word : words)
		{
			if(currentWord.trim().equals(word.trim()))
			{
				 flag = false;
				 break;
			}
		}
		if(flag)
		{
			s1 = s1.substring(0, startIndex) + reverse(s1.substring(startIndex));
		}		
		System.out.println(s1);
	}
	static String reverse(String word)
	{
		if(word.length() == 0)
		{
			return "";
		}
		return word.charAt(word.length() - 1) + reverse(word.substring(0, word.length() - 1));
	}
	
	
}
