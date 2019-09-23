package by.antonstroich.selfstudy.stringparser;

import java.util.List;
import java.util.ArrayList;

public class Parcer {
	
	public List<String> separateFileContentToStrings(String fileContent) {
		List<String> stringsAfterParsing = new ArrayList();
		for (String newString : fileContent.split(";")) {
			stringsAfterParsing.add(newString);
		}
		return stringsAfterParsing;
	}

	public void printFileContent(List<String> newStrings) {
		for (String stringToPrint : newStrings) {
			System.out.println(stringToPrint);
		}
	}
}