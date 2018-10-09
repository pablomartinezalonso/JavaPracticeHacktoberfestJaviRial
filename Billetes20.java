import java.util.Scanner;

public class Billetes20 {
	public static void main (String[] args) {
		
		Scanner sc=new Scanner(System.in);
				int cant =0;
				int q =0;
				int d =0;
				int c =0;
				int ci =0;
				int v =0;
				int di =0;
				int cin =0;
			
				
				System.out.println("Introduzca cantidad: ");
				cant=sc.nextInt();
				while (cant>=5) { //empieza bucle
				
				if(cant >=500) {
					q++;
					cant=cant-500;}
					else if(cant>=200){
					d++;
					cant=cant-200;}
					else if(cant>=100){
					c++;
					cant=cant-100;}
					else if(cant>=50){
					ci++;
					cant=cant-50;}
					else if(cant>=20){
					v++;
					cant=cant-20;}
					else if(cant>=10){
					di++;
					cant=cant-10;}
					else if(cant>=5){
					cin++;
					cant=cant-5;}
						
				}//acaba el bucle
					System.out.println("500 hay: " +q);
					System.out.println("200 hay: " +d);
					System.out.println("100 hay: " +c);
					System.out.println("50 hay: " +ci);
					System.out.println("20 hay: " +v);
					System.out.println("10 hay: " +di);
					System.out.println("5 hay: " +cin);
					System.out.println("La cantidad sobrante  es: " +cant);
					sc.close();
				}
}	
	
