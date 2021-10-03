class M35
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

		int temp = elements[elements.length - 1];
		for(int i = elements.length - 1; i > 0; i--)
		{
			elements[i] = elements[i - 1];
		}
		elements[0] = temp;

		System.out.println("final content");
		for(int i = 0; i < elements.length; i++)
		{
			System.out.print(elements[i] + ",");
		}
	}
}
