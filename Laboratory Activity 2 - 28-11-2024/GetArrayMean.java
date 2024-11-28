import java.util.Scanner;

public class GetArrayMean {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of integers: ");
        int n = scanner.nextInt();
        
        int[] numbers = new int[n];
        
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        
        double mean = getArrayMean(numbers);
        System.out.println("Mean: " + mean);
        
        scanner.close();
    }
    
    public static double getArrayMean(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }
        
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        
        return (double) sum / arr.length;
    }
}