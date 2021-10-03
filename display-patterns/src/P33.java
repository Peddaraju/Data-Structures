class P33
{
	public static void main(String[] args) 
	{
		int[][] elements = new int[5][3];
		elements[0][0] = 10;
		elements[0][1] = 11;
		elements[0][2] = 12;
		elements[1][0] = 20;
		elements[1][1] = 21;
		elements[1][2] = 22;
		elements[2][0] = 30;
		elements[2][1] = 31;
		elements[2][2] = 32;
		elements[1][2] = 22;
		elements[3][0] = 40;
		elements[3][1] = 41;
		elements[3][2] = 42;
		elements[4][0] = 50;
		elements[4][1] = 51;
		elements[4][2] = 52;

		for(int[] element : elements){
			for(int x : element){
				System.out.print(x + "\t");
			}
			System.out.println();
			System.out.println();
		}

	}
}
