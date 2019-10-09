package by.antonstroich.selfstudy.algorithmictask;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		String[] newArray = ArrayStringCreation.createStringArray("cat cat cat", "Cats ", "cat",
				"Cats cat cat cat cat Cats", "Cats cat cat cat cat 1", "Cat");
		System.out.println("A not sorted array: ");
		ArrayStringCreation.printArray(newArray);
		SortingArrayStrings SortingArray = new SortingArrayStrings();
		Arrays.sort(newArray, SortingArray);
		System.out.println("A sorted array: ");
		ArrayStringCreation.printArray(newArray);
	}
}
