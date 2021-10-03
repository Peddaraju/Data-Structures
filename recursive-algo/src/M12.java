class M12
{
	static int sum;

	static void findSum(int num)
	{
		sum += num;
		if(num == 20)
		{
			return;
		}
		num ++;
		findSum(num);
	}

	public static void main(String[] args) 
	{
		findSum(11);
		System.out.println(sum);
	}
}
