package proiectjava;
import java.util.Scanner;
public class Main {

	public static void main (String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1 Piept de pui");
		System.out.println("2 Fasole batuta");
		System.out.println("3 Branza feta");
		System.out.println("4 Apa");
		System.out.println("5 Sorina");
		System.out.println("6 Tigari varsate");
		System.out.println("7 Chifla");
		System.out.println("8 Bataie");
		System.out.println("Ce doresti? ");
		
		int op = sc.nextInt();
		
		switch(op) {
		
		case 1 : System.out.println("Ai ales : Piept de pui ");
		         break;
		         
		case 2 : System.out.println("Ai ales : 2 Fasole batuta ");
                 break;
                
		case 3 : System.out.println("Ai ales : 3 Branza feta ");
                 break;
               
		case 4 : System.out.println("Ai ales : 4 Apa");
		         break;
		         
		case 5 : System.out.println("Ai ales : 5 Sorina");
                 break;
                 
		case 6 : System.out.println("Ai ales : 6 Tigari varsate");
                break;
             
		case 7 : System.out.println("Ai ales : 7 Chifla");
                 break;
		case 8 : System.out.println("Ai ales : 8 Bataie ");
		         break;
		 
		
		}
		
		
		
		
	}    
	
	
	
}
