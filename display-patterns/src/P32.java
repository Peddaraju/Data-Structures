class P32 
{
	public static void main(String[] args) 
	{
		int[][] elements = new int[3][3];
		elements[0][0] = 10;
		elements[0][1] = 11;
		elements[0][2] = 12;
		elements[1][0] = 20;
		elements[1][1] = 21;
		elements[1][2] = 22;
		elements[2][0] = 30;
		elements[2][1] = 31;
		elements[2][2] = 32;

		for(int[] element : elements){
			for(int x : element){
				System.out.print(x + "\t");
			}
			System.out.println();
			System.out.println();
		}

	}
}
