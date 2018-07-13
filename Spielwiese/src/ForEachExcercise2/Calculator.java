package ForEachExcercise2;

public class Calculator {

	int calculateSum(int[] numbers) {
		int sum = 0;
		// sum up the values of all elements in numbers here and return the sum.
		for (int x : numbers) {
			sum += x;
		}
		return sum;
	}

	double calculateMean(int[] numbers) {
		double sum = calculateSum(numbers);
		//calculate the arithmetic mean here and return it.
		return sum/numbers.length;
	}
}

