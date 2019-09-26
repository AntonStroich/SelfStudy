package by.antonstroich.selfstudy.calculator;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		float value1 = InputValue.enterValue();
		String operator = InputOperator.enterOperator();
		float value2 = InputValue.enterValue();
		Calculation MyCalculation = new Calculation();
		float result = MyCalculation.calculateResult(value1, operator, value2);
	}
}
