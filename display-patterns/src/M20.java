/*
       *
      **
     ***
    ****
   *****
  ******
 *******
********




*/



class M20 
{
	public static void main(String[] args) 
	{
		int rows = 8;
		for(int rowCount = 1; rowCount <= rows; rowCount ++)
		{
			for(int j = 1; j <= (rows - rowCount); j++)
			{
				System.out.print(' ');
			}
			for(int j = 1; j <= rowCount; j++)
			{
				System.out.print('*');
			}
			System.out.println();
		}
	}
}
