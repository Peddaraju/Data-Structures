class M10
{
	public static void main(String[] args) 
	{
		print(10);
	}
	public static void print(int count)
	{
		System.out.println(count --);
		if(count == 0)
		{
			return;
		}
		print(count);
	}

}
