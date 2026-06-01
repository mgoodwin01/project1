// This class contains a method that calculates the average of N numbers.
public class AverageCalculator {

    // Method that accepts an array of doubles and returns the average.
    public double calculateAverage(double[] numbers) {

        // Guard clause: avoid dividing by zero
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Array must contain at least one number.");
        }

        double sum = 0;

        // Loop through the array and add all values
        for (double num : numbers) {
            sum += num;
        }

        // Return the computed average
        return sum / numbers.length;
    }
}
