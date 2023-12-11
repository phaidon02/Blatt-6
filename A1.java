package blatt6;

import java.util.Scanner;

public class A1 {
    public static void main(String[] args) {
        int a;
        Scanner in = new Scanner(System.in);

        System.out.println("Wieviele Elemente wollen sie eingeben?");       
        a=readInt(in);
        System.out.println("Bitte geben Sie "+a+" Elemente an:");
        int [] b =new int[a];
        for(int i=0; i<a; i++){
            b[i]=readInt(in);
        }
        printArray(b);
        printArray(invertArrayElements(b));     
    }
    
    public static void printArray(int[] b){
        System.out.println("Array:");
        for(int i=0; i<b.length; i++){
            System.out.print(b[i]);
            System.out.print(' ');
        }
        System.out.println();
    }

    public static int[] invertArrayElements(int [] a){
        for(int k = 0; k<a.length; k++){
            a[k]*=-1;
        }
        return a;
    }

    public static int readInt(Scanner in){
        boolean d = true;
        int a=0;
        while(d){         
            if (in.hasNextInt()) { 
                a=in.nextInt();
                d=false;               
            } else {                                              
                in.next();
            }
        }
        return a;
    }
}
