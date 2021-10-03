class M52
{
	public static void main(String[] args) 
	{
		int[] firstArray = {10, 40, 4, 50, 125, 5, 800, 6, 60, 9, 100, 12};   
		//                  0   1   2  3    4   5   6   7   8  9   10  11  
		int[] secondArray = {3, 6, 500, 45};  
		//                  0   1  2    3 
		// insert secondArray elements into firstArray from 9th index onwards
	    //int[] firstArray = {10, 40, 4, 50, 125, 5, 800, 6, 60, 3, 6, 500, 45, 9, 100, 12};   

		System.out.println("initial content");
		for(int i = 0; i < firstArray.length; i++)
		{
			System.out.print(firstArray[i] + ",");
		}
		System.out.println();
		int[] temp = firstArray;
		firstArray = new int[temp.length + secondArray.length];
		for(int i = 0; i < temp.length; i++)
		{
			firstArray[i] = temp[i];
		}
		for(int i = firstArray.length - 1; i > 12; i--)
		{
			firstArray[i] = firstArray[i - 4];
		}
		for(int i = 9, j = 0; j < secondArray.length; i++, j++)
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
