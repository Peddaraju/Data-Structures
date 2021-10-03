class M21
{
	public static void main(String[] args) 
	{
		String s1 = "java is better than apple";
		//           0123
		int i = s1.indexOf(' ');
		int words = 0;
		while(i != -1)
		{
			words ++;
			i = s1.indexOf(' ', i + 1);
		}
		System.out.println("Number of words in " + s1 + " are " + (words + 1));
	}
}
