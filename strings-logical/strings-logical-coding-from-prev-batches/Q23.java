
/*
Q22. find out first repeated char and
	 find out first non repeated char

case1:
	aaaaaaabtest
	first repeated char : a
	first non repeated char : b

case2:
	abcxyzcba
	first repeated char : c
	first non repeated char : x


*/
class Q23
{
	public static void main(String[] args) throws Exception 
	{
		String s1 = "abcxyzcba";
		int repeatedCharIndex = s1.length();
		for(int i = 0; i < s1.length(); i++)
		{
			for(int j = i + 1; j < s1.length(); j++)
			{
				if(s1.charAt(i) == s1.charAt(j))
				{
					if(repeatedCharIndex > j)
					{
						repeatedCharIndex = j;
					}
				}
			}
		}
		System.out.println("first repeated char :" + s1.charAt(repeatedCharIndex));

		int nonRepeatedCharIndex = s1.length();
		boolean repeated = false;
		for(int i = 0; i < s1.length(); i++)
		{
			for(int j = i + 1; j < s1.length(); j++)
			{
				if(s1.charAt(i) == s1.charAt(j))
				{
					repeated = true;
					break;
				}
			}
			if(!repeated)
			{
				nonRepeatedCharIndex  = i;
				break;
			}
			repeated = false;
		}
		System.out.println("first non repeated char :" + s1.charAt(nonRepeatedCharIndex ));





	}
}
	 



