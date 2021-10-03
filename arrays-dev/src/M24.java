class M24
{
	public static void main(String[] args) 
	{
		int[] elements = {10, 40, 4, 50, 125, 5, 800, 6};   
		int max = elements[0];
		for(int i = 1; i < elements.length; i++)
		{
			if(elements[i] > max)
			{
				max = elements[i];
			}
		}
		System.out.println("max:" + max);
	}
}
