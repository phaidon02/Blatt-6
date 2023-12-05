import java.util.Scanner;
import java.lang.Boolean;

public class A3 {
    public static void main(String[] args) {
        int eingabe = 0, versuche=0;
    
        boolean eingabeüberprüfung = true,  schleife=true;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Raten Sie die geheime Zahl.");

        while (schleife) {    
            versuche += 1;                            //zählt wiehäufig die schleife durchgelaufen ist
            eingabeüberprüfung=true;
            while (eingabeüberprüfung) {                  //eingabe abfrage bis ein Int eingegeben wurde

                if (scanner.hasNextInt()) {                    //überprüft ob der eingegebene wert ein Int ist
                    eingabe = scanner.nextInt();
                    eingabeüberprüfung = false;
                } else {                                              //leert den scanner wenn kein int eingegeben wurde
                    scanner.next();
                }
            }

            if (zahl(eingabe)==null) {                         //überprüft ob die methode zahl null zurückgegeben hat
                                                                                        
                System.out.println("Richtig. Sie benoetigten " + versuche + " Versuche.");                //gibt an wieviele versuche man gebraucht hat wenn Zahl wahr aus gibt                
                schleife = false;                     //beendet die schleife

            } else if(!zahl(eingabe)){                                 //überprüft ob die methode zahl false zurückgegebn hat
                System.out.println("Zu klein! Ihr Tipp?");

            }else if(zahl(eingabe)){                               //überprüft ob die methode zahl true zurückgegeben hat
                System.out.println("Zu gross! Ihr Tipp?");
            }
        }
        scanner.close();                                //schließt den scanner
    }




    public static Boolean zahl(int versuch) {          //Methode welche einene Int als input hat und einen Boolean aus (kann auch null sein im vergleich zu boolean) gibt


        Boolean b=null;                                 //sezt b auf true fals die eingabe >126 ist


        if (versuch < 126){                            //sezt b auf true fals die eingabe >126 ist
            b = false;
        }else if(versuch > 126){
            b = true;
        }

        return b;                                     //gibt den status von b zurück
    }
}