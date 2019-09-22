package by.antonstroich.selfstudy.stringparser;

import java.util.ArrayList;

public class Parcer {

	public ArrayList<String> separateFileContentToStrings(String fileContent) {
		ArrayList<String> stringsAfterParsing = new ArrayList<String>();
		for (String newString : fileContent.split(";")) {
			stringsAfterParsing.add(newString);
		}
		return stringsAfterParsing;
	}

	public void printFileContent(ArrayList<String> stringsAfterParsing) {
		for (String stringToPrint : stringsAfterParsing) {
			System.out.println(stringToPrint);
		}
	}

}
