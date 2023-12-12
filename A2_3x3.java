package blatt6;

import java.util.Scanner;

public class A2_3x3 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		int player=1;
		int eingabe;
		int e=1;
		char[][] board= new char[3][3];		
		
		for (int i=0; i<3; i++){
			for (int j=0; j<=2; j++){
				board[(i)][(j)]=(char)(e+'0');
				e++;
			}
		}

		
		
        for(int t=0;t<9;t++) {
			
        	for (int i=0; i<3; i++){
				for(int j=0; j<3; j++){
				System.out.print(board[i][j]);
				if (j!=2){
					System.out.print(" & ");
					}
				}
				System.out.println();
			}
	
    	    System.out.println("Spieler "+player+" ist dran");

    	    if(player==1) {
				e=1;
	    	    eingabe= zahl(input);
				for (int i=0; i<3; i++){
					for(int j=0; j<3; j++){
						if(e==eingabe){
							board[i][j]='X';
						}
						e++;
					}
				}  
	    	    player=2;
		
    	    }else {
	    	    e=1;
	    	    eingabe= zahl(input);
				for (int i=0; i<3; i++){
					for(int j=0; j<3; j++){
						if(e==eingabe){
							board[i][j]='O';
						}
						e++;
					}
				}  
    	    	player=1;
        	}
	
		}
		
		System.out.println("das Spiel ist zu Ende");
	
	}
	

	
	private static int zahl(Scanner in) {
						
		int x=0;
			
		System.out.println("Geben sie ihr Kästchen an ");
		while(1>x||x>9) {
				
			while(!in.hasNextInt()) {
				System.out.println("Bitte geben sie eine Ganze Zahl zwischen 1 und 9 an");
			    in.next();
			}
				 x= in.nextInt();
				 
		}
			

		return x;
	}

}
