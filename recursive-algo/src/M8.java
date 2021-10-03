class M8
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		print(1);
		System.out.println("main end");
	}
	static void print(int count)
	{	
		System.out.println("print with begin @ " + count);		
		if(count == 5)
		{
			return;
		}
		count ++;
		print(count);
		System.out.println("print with end @ " + count);
	}
}
