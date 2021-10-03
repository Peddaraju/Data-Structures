class M58
{
	public static void main(String[] args) 
	{
		int[] elements = {10, 40, 4, 50, 125, 5, 800, 6, 60, 9, 100, 12};   
		//                0   1   2  3    4   5   6   7   8  9   10  11  
		System.out.println("initial content");
		for(int i = 0; i < elements.length; i++)
		{
			System.out.print(elements[i] + ",");
		}
		System.out.println();
		
		int middle = (elements.length / 2) + (elements.length - (elements.length / 2)) / 2;
		for(int i = (elements.length / 2), j = 0; i < middle; i++, j++)
		{
			elements[i] = elements[i] + elements[elements.length - 1 - j];
			elements[elements.length - 1 - j] = elements[i] - elements[elements.length - 1 - j];
			elements[i] = elements[i] - elements[elements.length - 1 - j];
		}		
		
		System.out.println("final content");
		for(int i = 0; i < elements.length; i++)
		{
			System.out.print(elements[i] + ",");
		}
	}
}
