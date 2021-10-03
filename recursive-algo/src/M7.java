class M7
{
	public static void main(String[] args) 
	{
		print(5);
	}
	static void print(int count)
	{	
		System.out.println("print with begin @ " + count);		
		if(count == 1)
		{
			return;
		}
		count --;
		print(count);
		System.out.println("print with end @ " + count);
	}
}
