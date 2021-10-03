package app10101;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class F {
	public static void main(String[] args) throws Exception{
		System.out.println("enter path");
		String s1 = new Scanner(System.in).next();
		Map<String, Integer> map = new HashMap<String, Integer>();
		File file = new File(s1);
		listFiles(file, map);
		System.out.println(map);
	}
	static void listFiles(File file, Map<String, Integer> map) {
		File[] files = file.listFiles();
		String fileType;		
		for(File f1 : files) {
			if(f1.isFile() && f1.getName().lastIndexOf('.') != -1) {
				fileType = f1.getName().substring(f1.getName().lastIndexOf('.') + 1);
				if(map.get(fileType) == null) {
					map.put(fileType, 1);
				}
				else {
					map.put(fileType, map.get(fileType) + 1);
				}
			}
			else {
				listFiles(f1, map);
			}
		}		
	}
}
