import java.util.Scanner;
 
public class Ejercicio5 {
 
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int edad=0;
        int nivel_de_estudios=0;
        int ingresos=0;
        boolean jasp;       
         
        System.out.println("edad: ");
        edad=sc.nextInt();
         
        System.out.println("estudios: ");
        nivel_de_estudios=sc.nextInt();
         
        System.out.println("ingresos: ");
        ingresos=sc.nextInt();
         
        jasp = ((edad <= 28) && (nivel_de_estudios > 3) && (ingresos > 28000));
         
        System.out.println("CHAVAL TU JASP ES "+jasp);
    }
 
}