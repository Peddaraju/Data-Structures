class P42
{
	static int[][] elements = new int[5][4];
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
		System.out.println("spiral construction");
		int value = 1;
		while(left <= right && t <= b){
			if(dir == 0){
				for(int cols = left; cols <= right; cols++){
					elements[t][cols] = value ++;
				}
				t++;
			}
			else if(dir == 1){
				for(int rows = t; rows <= b; rows++){
					elements[rows][right] = value ++;
				}
				right--;
			}
			else if(dir == 2){
				for(int cols = right; cols >= left; cols--){
					elements[b][cols] = value ++;
				}
				b--;
			}
			else if(dir == 3){
				for(int rows = b; rows >= t; rows--){
					elements[rows][left] = value ++;
				}
				left ++;
			}
			dir ++;
			if(dir == 4){
				dir = 0;
			}
		}		
		System.out.println("read the pattern:");
		for(int[] element : elements){
			for(int x : element){
				System.out.print(x + "\t");
			}
			System.out.println();
			System.out.println();
		}
	}
}
