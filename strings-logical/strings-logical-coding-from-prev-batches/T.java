class T 
{
	void test()
	{
		System.out.println("test:" + this);
	}
	public static void main(String[] args) 
	{
		T t1 = new T();
		System.out.println("main1:" + t1);
		t1.test();
		System.out.println("main2:" + t1);
	}
}
