import java.util.Scanner;

public class SecondMinimumInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        double[] numbers = new double[6];

        
        System.out.println("Please enter 6 double values:");

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter value " + (i + 1) + ": ");
            numbers[i] = scanner.nextDouble();
        }

        
        Double secondMinimum = findSecondMinimum(numbers);

    
        if (secondMinimum != null) {
            System.out.println("The second minimum value in the array is: " + secondMinimum);
        } else {
            System.out.println("There is no second minimum value in the array.");
        }
        scanner.close();
    }


    public static Double findSecondMinimum(double[] array) {
        if (array.length < 2) {
            return null; 
        }

        double min = Double.MAX_VALUE;
        double secondMin = Double.MAX_VALUE;

        for (double num : array) {
            if (num < min) {
                secondMin = min;
                min = num; 
            } else if (num < secondMin && num != min) {
                secondMin = num;
            }
        }

        return (secondMin == Double.MAX_VALUE) ? null : secondMin; 
    }
}
