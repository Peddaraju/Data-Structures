/*

rows = 8


1
11
111
1111
11111
111111
1111111
11111111

*/




class M13 
{
	public static void main(String[] args) 
	{
		int rows = 8;
		for(int rowCount = 1; rowCount <= rows; rowCount ++)
		{
			for(int colCount = 1; colCount <= rowCount; colCount ++)
			{
				System.out.print(1);
			}
			System.out.println();
		}
	}
}
