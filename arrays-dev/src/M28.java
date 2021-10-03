class M28
{
	public static void main(String[] args) 
	{
		int[] elements = {10, 40, 4, 50, 125, 5, 800, 6};   
		System.out.println("initial content");
		for(int i = 0; i < elements.length; i++)
		{
			System.out.print(elements[i] + ",");
		}
		System.out.println();

		elements[0] = elements[0] + elements[elements.length - 1];	// 16
		elements[elements.length - 1] = elements[0] - elements[elements.length - 1];	// 10
		elements[0] = elements[0] - elements[elements.length - 1];    // 6

		System.out.println("final content");
		for(int i = 0; i < elements.length; i++)
		{
			System.out.print(elements[i] + ",");
		}
	}
}
