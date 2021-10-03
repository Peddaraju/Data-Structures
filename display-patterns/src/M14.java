/*

rows = 8


1
22
333
4444
55555
666666
7777777
88888888

*/




class M14
{
	public static void main(String[] args) 
	{
		int rows = 8;
		for(int rowCount = 1; rowCount <= rows; rowCount ++)
		{
			for(int colCount = 1; colCount <= rowCount; colCount ++)
			{
				System.out.print(rowCount);
			}
			System.out.println();
		}
	}
}
