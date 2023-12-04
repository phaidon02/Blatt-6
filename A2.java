import java.util.Scanner;

public class A2 {
    public static void main(String[] args) {
        int c = 0;
        boolean d = true;

        Scanner eingabe = new Scanner(System.in);

        while (d) {
            System.out.println("Geben Sie n an:");

            if (eingabe.hasNextInt()) {
                c = eingabe.nextInt();
                d = false;
            } else {
                eingabe.next();
            }
        }

        System.out.println(tabelle(c));

    }

    public static String tabelle(int a) {
        for (int i = 1; i <= a; i++){
            for (int j = 1; j <= 10; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println("");
        }
        return "";
    }
}