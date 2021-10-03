class M26
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

		int temp = elements[2];
		elements[2] = elements[5];
		elements[5] = temp;

		System.out.println("final content");
		for(int i = 0; i < elements.length; i++)
		{
			System.out.print(elements[i] + ",");
		}
	}
}
