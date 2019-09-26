package by.antonstroich.selfstudy.calculator;

public class Calculation {

	public float calculateResult(float value1, String operator, float value2) {
		float result = 0;
		switch (operator) {
		case "+":
			result = value1 + value2;
			System.out.print("= " + result);
			break;
		case "-":
			result = value1 - value2;
			System.out.print("= " + result);
			break;
		case "*":
			result = value1 * value2;
			System.out.print("= " + result);
			break;
		case "/":
			if (value2 == 0 && (operator.equals("/"))) {
				System.out.println("Impossilble to calculate when second value = 0");
			} else {
				result = value1 / value2;
				System.out.print("= " + result);
			}
			break;
		case "%":
			if (value2 == 0 && (operator.equals("%"))) {
				System.out.println("Impossilble to calculate when second value = 0");
			} else {
				result = value1 % value2;
				System.out.print("= " + result);
			}
		}
		return result;
	}
}
