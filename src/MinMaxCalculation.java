import java.util.ArrayList;

/**
 * A class to compute the minimum and maximum from a set of numbers.
 */
public class MinMaxCalculation {

    /**
     * Compute the minimum of an array of numbers.
     * @param numbers An array of double numbers.
     * @return The minimum number.
     */
    public static double min(double... numbers) {
        double min = Double.MAX_VALUE;
        for (double num : numbers) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    /**
     * Compute the maximum of an array of numbers.
     * @param numbers An array of double numbers.
     * @return The maximum number.
     */
    public static double max(double... numbers) {
        double max = Double.MIN_VALUE;
        for (double num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    /**
     * Helper method to convert ArrayList<Double> to primitive double array.
     * @param doubles An ArrayList of Double objects.
     * @return A primitive array containing the double values.
     */
    public static double[] getArrayDouble(ArrayList<Double> doubles) {
        double[] result = new double[doubles.size()];
        for (int i = 0; i < doubles.size(); i++) {
            result[i] = doubles.get(i);
        }
        return result;
    }

    public static void main(String[] args) {
        // Example usage
        ArrayList<Double> dataList = new ArrayList<>();
        // Add some example numbers
        dataList.add(1.2);
        dataList.add(3.4);
        dataList.add(5.6);
        dataList.add(7.8);
        dataList.add(9.0);

        double[] numbers = getArrayDouble(dataList);
        System.out.println("Minimum: " + min(numbers));
        System.out.println("Maximum: " + max(numbers));
    }
}