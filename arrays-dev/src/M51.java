class M51
{
	public static void main(String[] args) 
	{
		int[] firstArray = {10, 40, 4, 50, 125, 5, 800, 6, 60, 9, 100, 12};   
		//                 0   1  2  3    4   5   6   7   8  9   10  11  
		int[] secondArray = {3, 6, 500, 45};  
		//                 0   1  2    3 
		// add secondArray to firstArray
		System.out.println("initial content");
		for(int i = 0; i < firstArray.length; i++)
		{
			System.out.print(firstArray[i] + ",");
		}
		System.out.println();
		//adding two elements (500, 900) into array
		int[] temp = firstArray;
		firstArray = new int[temp.length + secondArray.length];
		for(int i = 0; i < temp.length; i++)
		{
			firstArray[i] = temp[i];
		}
		for(int i = temp.length, j = 0; i < firstArray.length; i++, j++)
		{
			firstArray[i] = secondArray[j];
		}
		System.out.println("final content");
		for(int i = 0; i < firstArray.length; i++)
		{
			System.out.print(firstArray[i] + ",");
		}
	}
}
