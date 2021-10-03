/*

int rows = 8

********
*******
******
*****
****
***
**
*





*/




class M16
{
	public static void main(String[] args) 
	{
		int rows = 8;
		for(int rowCount = 1; rowCount <= rows; rowCount ++)
		{
			for(int colCount = 1; colCount <= (rows + 1 - rowCount); colCount ++)
			{
				System.out.print('*');
			}
			System.out.println();
		}
	}
}
