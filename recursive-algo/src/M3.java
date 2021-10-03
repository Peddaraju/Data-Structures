class M3
{
	public static void main(String[] args) 
	{
		printHello(4);
	}
	static void printHello(int count)
	{
		System.out.println("Hello World!");
		if(count == 1)
		{
			return;
		}
		count --;
		printHello(count);
	}
}
