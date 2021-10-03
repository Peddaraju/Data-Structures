class A 
{
	public static void main(String[] args) 
	{
		int[] x = {20, 20};
		int i = 0, j = 0;
		x[i] = x[i] + x[j];
		x[j] = x[i] - x[j];
		x[i] = x[i] - x[j];
		System.out.println(java.util.Arrays.toString(x));
	}
}
