class U 
{
	void test()
	{
		System.out.println("test:" + this);
	}
	public static void main(String[] args) 
	{
		U u1 = new U();
		System.out.println("main1:" + u1);
		u1.test();
		U u2 = new U();
		System.out.println("main2:" + u2);
		u2.test();
	}
}
