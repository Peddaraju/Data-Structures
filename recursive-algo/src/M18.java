class M18 
{
	public static void main(String[] args) 
	{
		int sum = sum(1);
		System.out.println(sum);
	}
	static int sum(int i)
	{
		if(i == 5)
		{
			return 5;
		}
		return i + sum(++i);
	}
}
