package blatt6;

import java.util.Scanner;

public class A3_nur_3x3 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		int player=1;
		int eingabe;
		char[] board= new char[9];		
		
		for(int i =0;i<9;i++) {
			
			board[i]=(char)((i+1)+'0'); 
		}
		
        for(int t=0;t<9;t++) {
			
        	System.out.println(board[0]+" & "+board[1]+" & "+board[2]+"\n"
	                		  +board[3]+" & "+board[4]+" & "+board[5]+"\n"
			                  +board[6]+" & "+board[7]+" & "+board[8]+"\n");
	
    	    System.out.println("Spieler "+player+" ist dran");

    	    if(player==1) {
	
	    	    eingabe= zahl(input);
		
    	    	if(board[eingabe-1]==0||board[eingabe-1]==10){
	    	    	System.out.println("Dieses Feld ist schon belegt");
		        	eingabe= zahl(input);
		        }
			
    		    board[eingabe-1]='X';    
	    	    player=2;
		
    	    }else {
	    	    eingabe= zahl(input);
		
    		    if(board[eingabe-1]==0||board[eingabe-1]==10){
	    	    	System.out.println("Dieses Feld ist schon belegt");
	        		eingabe= zahl(input);
    		    }
		
		        board[eingabe-1]='O';		
    	    	player=1;
        	}
	
		}
		
		System.out.println("das Spiel ist zu Ende");
	
	}
	

	
	private static int zahl(Scanner s) {
						
		int x=0;
			
		System.out.println("Geben sie ihr Kästchen an ");
		while(1>x||x>9) {
				
			while(!s.hasNextInt()) {
				System.out.println("Bitte geben sie eine Ganze Zahl zwischen 1 und 9 an");
			    s.next();
			}
				 x= s.nextInt();
				 
		}
			

		return x;
	}

}
