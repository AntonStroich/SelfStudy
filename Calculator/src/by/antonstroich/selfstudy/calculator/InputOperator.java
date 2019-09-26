package by.antonstroich.selfstudy.calculator;

import java.util.Scanner;

public class InputOperator {

	public static String enterOperator() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a mathematical operator: ");
		String operator = scan.nextLine();
		if (operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/")
				|| operator.equals("%")) {
			return operator;
		} else {
			System.out.print("You've entered invalid value for the mathematical operator. Please try again!" + "\n");
			return enterOperator();
		}
	}
}
