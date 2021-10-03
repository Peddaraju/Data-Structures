package app10101;

import java.io.File;
import java.util.Scanner;

public class D {
	public static void main(String[] args) throws Exception{
		System.out.println("enter path");
		String s1 = new Scanner(System.in).next();
		File file = new File(s1);
		File[] files = file.listFiles();
		for(File f1 : files) {
			System.out.println(f1.getName());
		}
	}
}
