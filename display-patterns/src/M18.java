/*

int rows = 8

12345678
1234567
123456
12345
1234
123
12
1





*/




class M18
{
	public static void main(String[] args) 
	{
		int rows = 8;
		for(int rowCount = 1; rowCount <= rows; rowCount ++)
		{
			for(int colCount = 1; colCount <= (rows + 1 - rowCount); colCount ++)
			{
				System.out.print(colCount);
			}
			System.out.println();
		}
	}
}
