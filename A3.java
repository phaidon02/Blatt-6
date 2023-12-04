import java.util.Scanner;

public class A3 {
    public static void main(String[] args) {
        int c = 0, e=0;
    
        boolean d = true,  f=true, a;


        Scanner eingabe = new Scanner(System.in);

        System.out.println("Raten Sie die geheime Zahl.");

        while (f) {    
            e += 1;                                                                                 //zählt wiehäufig die schleife durchgelaufen ist
            d=true;
            while (d) {                                                                             //eingabe abfrage bis ein Int eingegeben wurde
                if (eingabe.hasNextInt()) {
                    c = eingabe.nextInt();
                    d = false;
                } else {
                    eingabe.next();
                }
            }

            if (zahl(c)) {                                                                         //fragt ab ob die methode zahl whar oder Falsch aus gibt

                System.out.println("Richtig. Sie benoetigten " + e + " Versuche.");                //gibt an wieviele versuche man gebraucht hat wenn Zahl wahr aus gibt
                f = false;                                                                         //beendet die schleife
            }
        }
    }




    public static Boolean zahl(int a) {                                                             //Methode welche einene Int als input hat und einen boolean aus gibt


        Boolean b = true;                                                                           //definirt b als standartmäßig wahr


        if (a < 126){                                                                               //sezt b auf false fals die eingabe !=126 ist und schreibt in die konsole ob die zahl größer oder kleiner 126 ist
            System.out.println("Zu klein! Ihr Tipp?");
            b = false;
        }else if(a > 126){
            System.out.println("Zu gross! Ihr Tipp?");
            b = false;
        }

        return b;                                                                                   //gibt den status von b zurück
    }
}