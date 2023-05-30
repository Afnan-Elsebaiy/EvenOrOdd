import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Please Enter Any Number");
        int number = sc.nextInt();
        if(number >= 0){
            System.out.println("This is a Positive number");
            if(number%2==0)
                System.out.println("This is an Even number");
            else
                System.out.println("This is an Odd number");
        }else
            System.out.println("This is a Negative number");
    }
}