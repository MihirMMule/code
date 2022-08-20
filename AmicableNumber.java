import java.util.Scanner;
 
public class AmicableNumber {
 
	public static void main(String[] args) {
		
 
		int firstNumber, secodNumber;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter two Numbers: ");
		firstNumber = scanner.nextInt();
		secodNumber = scanner.nextInt();
		
		boolean flag = checkAmicableOrNot(firstNumber, secodNumber);
		
		if (flag) {
			System.out.println("The numbers are amicable");
		} else {
			System.out.println("The numbers are not amicable");
		}
	}
 
	static boolean checkAmicableOrNot(int firstNumber, int secondNumber) {
		int s = 0, i;
		
		for (i = 1; i < firstNumber; i++) {
			if (firstNumber % i == 0) {
				s = s + i;
			}
		}
		if (s == secondNumber) {
			s = 0;
			for (i = 1; i < secondNumber; i++) {
				if (secondNumber % i == 0) {
					s = s + i;
				}
			}
			if (s == firstNumber)
				return true;
			else
				return false;
		}
		
		return false;
 
	}
 
}


