class M39
{
	public static void main(String[] args) 
	{
		int[] elements = {10, 40, 4, 50, 125, 5, 800, 6, 60, 9, 100, 12};   
		System.out.println("initial content");
		for(int i = 0; i < elements.length; i++)
		{
			System.out.print(elements[i] + ",");
		}
		System.out.println();
		
		int t1 = elements[elements.length - 2];
		int t2 = elements[elements.length - 1];
		for(int i = elements.length - 3; i >= 0; i--)
		{
			elements[i + 2] = elements[i];
		}
		elements[0] = t1;
		elements[1] = t2;

		System.out.println("final content");
		for(int i = 0; i < elements.length; i++)
		{
			System.out.print(elements[i] + ",");
		}
	}
}
