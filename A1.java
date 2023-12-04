import java.util.Scanner;

public class A1 {
    public static void main(String[] args) {
        int b = 1, c = 0;
        boolean d = true;

        Scanner eingabe = new Scanner(System.in);

        while (d) {
            System.out.println("Geben Sie n an:");

            if (eingabe.hasNextInt()) {
                c = eingabe.nextInt();
                d = false;
            } else{
                eingabe.next();
            }
        }

        for (int i = 1; i <= c ; i++){
            b = b * i;
        }
        System.out.println("n! = " + b);
    }
}