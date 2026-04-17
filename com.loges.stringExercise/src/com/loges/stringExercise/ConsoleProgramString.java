package com.loges.stringExercise;

import java.util.Scanner;

public class ConsoleProgramString {
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		String line = sc.nextLine();
		
		int lengthOfChar = line.length();
		
		String[] noOfWords = line.split(" ");
		
		System.out.println(lengthOfChar);
		
		for(int i=0;i<noOfWords.length;i++)
		{
			System.out.println(noOfWords[i]);
		}
		
		
		char[] noOfVowels =  line.toCharArray();
		
		int vowelsCount=0;
		int constantsCount=0;
		
		for(int i=0;i<noOfVowels.length;i++)
		{
			if(noOfVowels[i]=='a'||noOfVowels[i]=='e'||noOfVowels[i]=='i'||noOfVowels[i]=='o'||noOfVowels[i]=='u')
			{
				vowelsCount=vowelsCount+1;
			}
			else
			{
				constantsCount=constantsCount+1;
			}
		}
		
		System.out.println("vowels count"+vowelsCount);
		System.out.println("Consonants count"+constantsCount);
		
		
		for(int i=noOfVowels.length-1;i>=0;i--)
		{
			System.out.println(noOfVowels[i]);
		}
	}

}
