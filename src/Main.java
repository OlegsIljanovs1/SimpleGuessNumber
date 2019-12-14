import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your guess from 1 to 3 : ");
        int b;
        String c;


        b = scanner.nextInt();
        c = scanner.nextLine();


        int a = (int) (Math.random() * (1 + 1)) + 1;
        System.out.println(a);

        if (b == a) {
            System.out.println("You won!");
        } else {
            System.out.println("You lost! ");
        }


    }
}
