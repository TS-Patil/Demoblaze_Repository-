package com.demoblaze.program;



public class Reverse_String_2ndWay {
	
	public static void main(String[] args) {
		String name ="DemoBlaze";
		
		for (int i = name.length()-1; i >=0; i--) {
			
			System.out.print(name.charAt(i));
			
		}
	}

}
