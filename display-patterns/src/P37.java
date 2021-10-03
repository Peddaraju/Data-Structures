class P37
{
	static int[][] elements = new int[5][4];

	static{
		elements[0][0] = 10;
		elements[0][1] = 11;
		elements[0][2] = 12;
		elements[0][3] = 13;
		elements[1][0] = 20;
		elements[1][1] = 21;
		elements[1][2] = 22;
		elements[1][3] = 23;
		elements[2][0] = 30;
		elements[2][1] = 31;
		elements[2][2] = 32;
		elements[2][3] = 33;
		elements[3][0] = 40;
		elements[3][1] = 41;
		elements[3][2] = 42;
		elements[3][3] = 43;
		elements[4][0] = 50;
		elements[4][1] = 51;
		elements[4][2] = 52;
		elements[4][3] = 53;
		System.out.println("pattern:");
		for(int[] element : elements){
			for(int x : element){
				System.out.print(x + "\t");
			}
			System.out.println();
			System.out.println();
		}
	}

	public static void main(String[] args) 
	{
		System.out.println("reading 1st row and 4th column values");
		for(int cols = 0; cols <= 3; cols++){
			System.out.print(elements[0][cols] + ", ");
		}
		for(int rows = 1; rows <= 4; rows++){
			System.out.print(elements[rows][3] + ", ");
		}
	}
}
