class M6
{
	public static void main(String[] args) 
	{
		printHello(5);
	}
	static void printHello(int count)
	{		
		if(count == 1)
		{
			return;
		}
		System.out.println("Hello World!");
		count --;
		printHello(count);
	}
}
