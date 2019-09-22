package by.antonstroich.selfstudy.stringparser;

import java.awt.List;
import java.io.*;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		try {
			String pathToGetFile = "c:/myFiles/String.txt";
			ReadingOfFile myReadingOfFile = new ReadingOfFile();
			String fileContent = myReadingOfFile.readFile(pathToGetFile);
			Parcer myParcer = new Parcer();
			// replace ArrayList to List
			ArrayList<String> newStrings = myParcer.separateFileContentToStrings(fileContent);
			myParcer.printFileContent(newStrings);
		} catch (Exception e) {
			System.out.println("Program can't be finished!");
			e.printStackTrace();
		}
	}
}
