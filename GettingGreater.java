import java.util.Scanner;

public class GettingGreater{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first character: ");
        char ch1 = scanner.next().charAt(0);
        int first = (int)ch1;
        System.out.print("Enter second character: ");
        char ch2 = scanner.next().charAt(0);
        int second = (int)ch2;
        char maxChar = (char) Math.max(ch1, ch2);
        
        System.out.println("The character with the greater value is: " +maxChar);
        System.out.println("first: " +ch1);
        System.out.println("second: " +ch2);
        
        scanner.close();
    
    }

}
