package app10101;

import java.io.File;
import java.util.Scanner;

public class E {
	public static void main(String[] args) throws Exception{
		System.out.println("enter path");
		String s1 = new Scanner(System.in).next();
		File file = new File(s1);
		listFiles(file);
	}
	static void listFiles(File file) {
		File[] files = file.listFiles();
		for(File f1 : files) {
			if(f1.isFile()) {
				System.out.println(f1.getName());
			}
			else {
				listFiles(f1);
			}
		}		
	}
}
