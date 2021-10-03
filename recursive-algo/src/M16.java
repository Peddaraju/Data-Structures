class M16
{
	public static void main(String[] args) 
	{
		String s1 = "helloToJava";
		print(s1, s1.length() - 1);		
	}
	static void print(String s1, int index)
	{
		System.out.println(s1.charAt(index --));
		if(index == -1)
		{
			return;
		}
		print(s1, index);
	}
}
