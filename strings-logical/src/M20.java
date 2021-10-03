class M20
{
	public static void main(String[] args) 
	{
		String s1 = "java is better than apple";
		//           0123
		int i = s1.lastIndexOf('a');
		while(i != -1)
		{
			System.out.println(i);
			i = s1.lastIndexOf('a', i - 1);
		}
	}
}
