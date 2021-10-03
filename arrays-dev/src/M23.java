class M23
{
	public static void main(String[] args) 
	{
		int[] elements = {10, 40, 4, 7, 25, 5, 8, 6};   // 6 elements
		               //  0   1   2  3   4   5

		int min = elements[0];
		for(int i = 1; i < elements.length; i++)
		{
			if(elements[i] < min)
			{
				min = elements[i];
			}
		}
		System.out.println("min:" + min);
	}
}
