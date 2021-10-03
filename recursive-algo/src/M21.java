class M21 
{
	public static void main(String[] args) 
	{
		int i = 47245;
		print(i);		
	}
	static void print(int i)
	{
		if(i == 0)
		{
			return;
		}
		System.out.println(i % 10);
		print(i / 10);
	}
}
