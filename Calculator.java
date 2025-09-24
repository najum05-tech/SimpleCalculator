import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner cal= new Scanner(System.in);
        System.out.println("Simple Caculator");

        System.out.print("Enter First Number: ");
        int n1= cal.nextInt();
        System.out.print("Enter Second Number: ");
        int n2= cal.nextInt();
        int n3= n1+n2;
        int n4= n1-n2;
        int n5= n1*n2;
        int n6= n1/n2;
        int n7= n1%n2;

        System.out.println("Sum= : "+n1);
        System.out.println("Difference= : "+n2);
        System.out.println("Product= : "+n3);
        System.out.println("Quotient= : "+n4);
        System.out.println("Remainder= : "+n5);
    }
}