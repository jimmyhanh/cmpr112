//Hung Anh Ho
//10-31-2022;
//Word counter

import java.util.Scanner;
import java.io.*;
public class WordCounter 
{
	public static void main(String[] args) throws IOException
	{
		String input = Input.getString("\nEnter a string input: ");
		System.out.printf("\nNumber of words: %d\n", wordCount(input));
	}

	/**
	 * wordCOunt method get the input String, tokenize it, and return the word count-integer type
	 * @param input-String type
	 * @return word count-integer type
	 */
	public static int wordCount(String input)
	{
		String list[] = input.split(" ");
		return list.length;
	}
}
