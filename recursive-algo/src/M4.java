class M4
{
	public static void main(String[] args) 
	{
		printHello(1);
	}
	static void printHello(int count)
	{
		System.out.println("Hello World!");
		if(count == 4)
		{
			return;
		}
		count ++;
		printHello(count);
	}
}
