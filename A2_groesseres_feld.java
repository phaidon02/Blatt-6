package blatt6;

import java.util.Scanner;

public class A2_groesseres_feld {
	private static void feld(char[][] spielfeld, int groesse) {
		int a = 10, c = 1;
		char b =' ';
		for (int i=0; i<groesse; i++){
			for(int j=0; j<groesse; j++){
				b = spielfeld[i][j];
				if (Character.isDigit(b)){
				System.out.print(spielfeld[i][j]);
				}else if (Character.isAlphabetic(b) ){
					System.out.print(spielfeld[i][j]);
					if(c>=10){
						a++;
					}
				}else{
					System.out.print(a);
					a++;
				}
				if (j!=groesse-1){
				System.out.print(" & ");
				}
				c++;
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int spieler = 2, greosse = 4, e = 1;
		char[][] board = new char[greosse][greosse];
		boolean end = true;
		
		for (int i=1; i<=greosse; i++){
			for (int j=1; j<=greosse; j++){
				board[(i-1)][(j-1)]=(char)(e+'0');
				e++;
			}
		}
		feld(board, greosse);
		while (end) {	
			if (ende(board, e)){
					break;
				}
			if (spieler%2==0){
				zug(board, 1, e, in);
				spieler+=1;
				feld(board, greosse);
			}else if(spieler%2 != 0){
				zug(board, 2, e, in);
				spieler+=1;
				feld(board, greosse);
			}
		}
		System.out.println("das Spiel ist zu Ende");
		in.close();
	}

	private static void zug(char[][] board, int spielr, int groesse, Scanner in) {
		String eingabe="";
		char a=' ';
		boolean b=true;
		int n = groesse, count=1;

		if (spielr == 1){
			a='X';
		}else if (spielr == 2){
			a='O';
		}
		while (b) {
			System.out.println("Spieler "+ spielr +", bitte geben Sie Ihren Zug ein:");
			if(in.hasNext("")){
				System.out.println("Feld schon belegt oder existiert nicht. Nochmal");
			}else{
				eingabe = in.nextLine();
			}
			while( n != 0)  {  
// removing the last digit of the number n  
				n = n / 10;  
// increasing count by 1  
				count = count + 1;  
			}  
			if(eingabe.matches("[0-9]+") && eingabe.length() <= count && count <= groesse){
				if (move(board, eingabe, a, groesse)){
					b=false;
				}else{
					System.out.println("Feld schon belegt oder existiert nicht. Nochmal");
				}	
			}else{
				System.out.println("Feld schon belegt oder existiert nicht. Nochmal");
			}
		}
	}


	private static boolean move(char[][] board, String position, char symbol, int groesse) {
		boolean valid = false;
		for (int i=0; i<=Math.sqrt(groesse); i++){
			if((Integer.valueOf(position)/Math.sqrt(groesse))==i){
				Double a= Integer.valueOf(position)-((Math.sqrt(groesse))*(i));
				int j = a.intValue();
				if (board[i][j-1]!='X' && board[i][j-1]!='O'){
					board[i][j-1]=symbol;
					valid = true;
				}
			}
			if((Integer.valueOf(position)/Math.sqrt(groesse))<i+1 && Integer.valueOf(position)/Math.sqrt(groesse)>i){
				Double a= Integer.valueOf(position)-((Math.sqrt(groesse))*(i));
				int j = a.intValue();
                if (i>=1){
                    j+=1;
                }
				if (board[i][j-1]!='X' && board[i][j-1]!='O'){
					board[i][j-1]=symbol;
					valid = true;
				}
			}
		}
		System.out.println();
		return valid;
	}

	private static boolean ende(char[][] board, int greosse){
		int a = greosse;
		for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 'X' || board[i][j] == 'O') {
                    a-=1;
                }
            }
        }
		if (a <= 1){
			return true;
		}else{
			return false;
		}
	}
}
