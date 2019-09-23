package by.antonstroich.selfstudy.stringparser;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadingOfFile {

	public String readFile(String pathToGetFile) {
		String fileContent = null;
		try (BufferedReader readFromFile = new BufferedReader(new FileReader(pathToGetFile))) {
			fileContent = readFileToString(readFromFile);
		} catch (Exception exceptionAfterFileReading) {
			System.out.println("File is not available: ");
			exceptionAfterFileReading.printStackTrace();
		}
		return fileContent;
	}

	public String readFileToString(BufferedReader readFromFile) throws IOException {
		StringBuilder collectStringsFromFile = new StringBuilder();
		collectStringsFromFile.setLength(100000);
		String stringFromFile;
		while ((stringFromFile = readFromFile.readLine()) != null) {
			collectStringsFromFile.append(stringFromFile);
		}
		return collectStringsFromFile.toString();
	}
}
