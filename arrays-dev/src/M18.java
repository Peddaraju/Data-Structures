class M18
{
	public static void main(String[] args) 
	{
		int[] elements = {10, 40, 15, 40, 25, 5};   // 6 elements
		               //  0   1   2  3   4   5

		int sum = 0;
		for(int i = 0; i < elements.length; i++)
		{
			sum += elements[i];
		}

		System.out.println(sum);
	}
}
