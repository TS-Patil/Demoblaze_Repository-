package com.demoblaze.program;

public class Reverse_String_3rdWay {
	
	public static void main(String[] args) {
		String name = "Demoblaze";
		
		char [] arr = name.toCharArray();
		
		for(int i = arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]);
		}
	}
	


}
