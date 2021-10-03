/*
	12345
	23456
	34567
	45678
	56789
*/



class M11 
{
	public static void main(String[] args) 
	{
		for(int i = 1; i <= 5; i++)
		{
			for(int j = i; j <= (i + 4); j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}			
	}
}
