class M5
{
	public static void main(String[] args) 
	{
		printHello(1);
	}
	static void printHello(int count)
	{		
		if(count == 5)
		{
			return;
		}
		System.out.println("Hello World!");
		count ++;
		printHello(count);
	}
}
