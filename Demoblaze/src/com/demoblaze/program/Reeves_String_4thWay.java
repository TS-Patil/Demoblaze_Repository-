package com.demoblaze.program;

import java.util.ArrayList;
import java.util.Collections;

public class Reeves_String_4thWay {
	
	public static void main(String[] args) {
		
		String name = "Demoblaze";
		ArrayList<Character> arr = new ArrayList<Character>();
		for (int i = 0; i < args.length; i++) {
			
			arr.add(name.charAt(i));
			System.out.println(name.charAt(i));
		}
		
		
	
		
		System.out.println(arr);

		
		
	}

}
