
import java.util.Scanner;

public class Billetes {
	
	public static void main (String[]args) {
		
		Scanner sc = new Scanner (System.in) ;
		
		System.out.println("Por favor introduzca la cantidad de euros :");
		int a = sc.nextInt();
		
		int b = a/500; //Billetes de 500
		int c = (a%500)/200; //Billetes de 200
		int d = ((a%500)%200)/100; // Billetes de 100
		int x = ((a%500)%200)% 100; //Operacion intermedia para reducir la ecuacion
		int e = x / 50;//Billetes 50
		int f = (x % 50)/20; // Billetes 20
		int g = ((x%50)%20)/10;
		int h = (((x%50)%20)%10)/5;
		int i = ((((x%50)%20)%10)%5)/1;
		
		if (b >= 1) {
		System.out.println("Billetes de 500 -> " + b);}
		if (c >= 1) {
		System.out.println("Billetes de 200 -> " + c);}
		if (d >= 1) {
		System.out.println("Billetes de 100 -> " + d);}
		if (e >= 1) {
		System.out.println("Billetes de 50  -> " + e);}
		if (f >= 1) {
		System.out.println("Billetes de 20  -> " + f);}
		if (g >= 1) {
		System.out.println("Billetes de 10  -> " + g);}
		if (h >= 1) {
		System.out.println("Billetes de 5   -> " + h);}
		if (i >= 1) {
		System.out.println("Te sobran       -> " + i +" Euros");}
	}
}
