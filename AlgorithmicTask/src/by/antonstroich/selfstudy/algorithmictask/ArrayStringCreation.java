package by.antonstroich.selfstudy.algorithmictask;

public class ArrayStringCreation {

	public static String[] createStringArray(String str1, String str2, String str3, String str4, String str5, String str6) {
		String[] myArray = new String[] {str1, str2, str3, str4, str5, str6};
		return myArray;
	}

	public static void printArray(String[] myArray) {
		for (int i = 0; i < myArray.length; i++) {
			System.out.println(myArray[i]);
		}
	}
}
