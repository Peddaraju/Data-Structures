class M9 
{
	public static void main(String[] args) 
	{
		print(1);
	}
	public static void print(int count)
	{
		System.out.println(count ++);
		if(count == 5)
		{
			return;
		}
		print(count);
	}

}
