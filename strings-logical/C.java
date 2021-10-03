package app10101;





public class C {
	public static void main(String[] args) {
		String s1 = "abc;;;;;hello      123.....test&&&&&param+java:::::btm";
		String[] elements = s1.split("[;:. &+]+");
		for(String str : elements) {
			System.out.println(str);
		}
	}
}
