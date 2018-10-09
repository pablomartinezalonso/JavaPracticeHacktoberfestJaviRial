import java.util.Scanner;

public class Propuesto9 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Por favor introduzca los segundos ");
		int t = sc.nextInt();
		
		int h = t/3600;
		
		int m = (t%3600)/60;
		
		int s = (t%3600)% 60;
		
		
		System.out.println("Han pasado " + h + ":" + m +":" + s );
		
		sc.close();
	}

}
