class P41
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
		int t = 0, b = 4, left = 0, right = 3;
		int dir = 0;

		/*
			0 => l -> r
			1 => t -> b
			2 => r -> l
			3 => b -> t
		*/

		System.out.println("spiral reading");
		while(left <= right && t <= b){
			if(dir == 0){
				for(int cols = left; cols <= right; cols++){
					System.out.print(elements[t][cols] + ", ");
				}
				t++;
			}
			else if(dir == 1){
				for(int rows = t; rows <= b; rows++){
					System.out.print(elements[rows][right] + ", ");
				}
				right--;
			}
			else if(dir == 2){
				for(int cols = right; cols >= left; cols--){
					System.out.print(elements[b][cols] + ", ");
				}
				b--;
			}
			else if(dir == 3){
				for(int rows = b; rows >= t; rows--){
					System.out.print(elements[rows][left] + ", ");
				}
				left ++;
			}
			dir ++;
			if(dir == 4){
				dir = 0;
			}
		}
	}
}
