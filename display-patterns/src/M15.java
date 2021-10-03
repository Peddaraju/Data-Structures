/*

rows = 8


1
12
123
1234
12345
123456
1234567
12345678

*/




class M15
{
	public static void main(String[] args) 
	{
		int rows = 8;
		for(int rowCount = 1; rowCount <= rows; rowCount ++)
		{
			for(int colCount = 1; colCount <= rowCount; colCount ++)
			{
				System.out.print(colCount);
			}
			System.out.println();
		}
	}
}
