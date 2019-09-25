package by.antonstroich.selfstudy.stringparser;

import java.util.List;
import java.util.ArrayList;

public class Printer {

	public void printFileContent(List<String> newStrings) {
		for (String stringToPrint : newStrings) {
			System.out.println(stringToPrint);
		}
	}

}
