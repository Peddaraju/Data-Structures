class M44
{
	public static void main(String[] args) 
	{
		int[] elements = {10, 40, 4, 50, 125, 5, 800, 6, 60, 9, 100, 12};   
		//                 0   1  2  3    4   5   6   7   8  9   10  11  
		System.out.println("initial content");
		for(int i = 0; i < elements.length; i++)
		{
			System.out.print(elements[i] + ",");
		}
		System.out.println();

		//remove  elements with index numbers 5, 6, 7, 8, 9 and 10 elements)
		//left shift by 6 from index number 5
		for(int i = 5; i < elements.length - 6; i++)
		{
			elements[i] = elements[i + 6];
		}
		
		int[] temp = elements;
		elements = new int[temp.length - 6];
		for(int i = 0; i < elements.length; i++)
		{
			elements[i] = temp[i];
		}
		System.out.println("final content");
		for(int i = 0; i < elements.length; i++)
		{
			System.out.print(elements[i] + ",");
		}
	}
}
