class M7
{
	public static void main(String[] args) 
	{
		int[] elements = {10, 40, 15, 40, 25, 5};   // 6 elements
		               //  0   1   2  3   4   5
		for(int i = 1; i < elements.length; i += 2)
		{
			System.out.println(elements[i]);
		}
	}
}
