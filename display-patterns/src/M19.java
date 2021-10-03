/*


rows = 8

********
 *******
  ******
   *****
    ****
	 ***
	  **
	   *



*/



class M19
{
	public static void main(String[] args) 
	{
		int rows = 8;
		for(int rowCount = 1; rowCount <= rows; rowCount ++)
		{
			for(int j = 1; j <= (rowCount - 1); j++)
			{
				System.out.print(' ');
			}
			for(int j = 1; j <= (rows + 1 - rowCount); j++)
			{
				System.out.print('*');
			}
			System.out.println();
		}
	}
}
