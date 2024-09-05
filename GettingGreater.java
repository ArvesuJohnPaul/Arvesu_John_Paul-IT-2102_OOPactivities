import java.util.Scanner;

public class GettingGreater{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first character: ");
        char ch1 = scanner.next().charAt(0);
        
        System.out.print("Enter second character: ");
        char ch2 = scanner.next().charAt(0);

        char maxChar = (char) Math.max(ch1, ch2);
        
        System.out.println("The character with the greater value is: " +maxChar);
        System.out.println("Genre: " +ch1);
        System.out.println("Album: " +ch2);
        
        scanner.close();
    
    }

}
