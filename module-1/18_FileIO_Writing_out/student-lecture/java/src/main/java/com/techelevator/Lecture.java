package com.techelevator;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Lecture
{

	public static void main(String[] args) 
	{

		Scanner userInput = new Scanner(System.in);

		/*
		 * The java.io.File class is a representation of file and directory path names.
		 * It provides methods to inspect and modify file system objects.
		 *
		 * One benefit is that it compensates for differences in Windows and Unix use of
		 * '/' and '\' as directory delimiters.
		 *
		 * A new instance of File can be created from a String that contains a file
		 * system path
		 */
		System.out.print("Enter a file name: ");
		String path = userInput.nextLine();
		
		File file = new File(path);
		
		System.out.println(file);
		System.out.println(file.getAbsolutePath());
		
		// this is basically the prompt "do you want to overwrite?"
		// allows user to make the decision to delete/overwrite/keep a file
//		if(file.exists())
//		{
//			file.delete();
//			System.out.println("deleting file");
//		}
//		
		try
		{
			// if I run this twice, it will create the file the first time
			// and won't overwrite the 2nd time.
			// UNLESS the above if statement exists (file.delete();)
//			boolean isFileCreated = file.createNewFile();
			
//			System.out.println("Created file: " + isFileCreated);
			
			System.out.print("Add text: ");
			String line = userInput.nextLine();
			
			// write to the file vvvvv
			// true means I want to append to the file. Without it, it will override.
			// with Java, if you try to append to a file that does not exist,
			// Java will create the new file, append, and allow you to keep appending
			FileOutputStream fileStream = new FileOutputStream(file, true);
//			BufferedOutputStream fileBuffer = new BufferedOutputStream(fileStream);
			PrintStream fileWriter = new PrintStream(fileStream);
			
			fileWriter.println(line);
			
			//cleans out the buffer
			fileWriter.flush();
			
			fileWriter.close();
			
			//		System.out.println();
			//		System.out.println(line);
		}
		catch (Exception e)
		{
			// TODO: handle exception
		}
		
	}

}
