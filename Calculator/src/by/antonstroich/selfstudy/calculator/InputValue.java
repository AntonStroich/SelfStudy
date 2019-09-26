package by.antonstroich.selfstudy.calculator;

import java.util.Scanner;

public class InputValue {

	public static float enterValue() {
		float value = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a value: ");
		if (sc.hasNextFloat()) {
			value = sc.nextFloat();
			return value;
		} else {
			System.out.print("You've entered invalid value. Please try again." + "\n");
			return enterValue();
		}
	}
}
