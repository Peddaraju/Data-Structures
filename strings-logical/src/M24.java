class M24
{
	public static void main(String[] args) 
	{
		String s1 = "core java is base to all java and JEE in a java echo system";
		//           0123
		int i = s1.lastIndexOf("java");
		while(i != -1)
		{
			System.out.println("java is available @ " + i);
			i = s1.lastIndexOf("java", i - 1);
		}
	}
}
