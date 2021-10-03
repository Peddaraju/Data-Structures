class M23
{
	public static void main(String[] args) 
	{
		int i = 47245;
		int count = digitsCount(i);	
		System.out.println(count);
	}
	static int digitsCount(int i)
	{
		if(i == 0)
		{
			return 0;
		}
		return 1 + digitsCount(i / 10);
	}
}
