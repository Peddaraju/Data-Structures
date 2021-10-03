class M23
{
	public static void main(String[] args) 
	{
		String s1 = "core java is base to all java and JEE in a java echo system";
		//           0123
		int i = s1.indexOf("java");
		int words = 0;
		while(i != -1)
		{
			words ++;
			i = s1.indexOf("java", i + 1);
		}
		System.out.println("java is available in " + words + " times in " + s1);

	}
}
