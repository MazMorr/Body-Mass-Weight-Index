import java.util.Scanner;

public class Calculo_IMC {
    public static void main (String[]args){
        Scanner OP=new Scanner(System.in);
        System.out.println("Bienvenido a la calculadora de Índice de Masa Corporal de Marco");
        System.out.println("Introduzca su peso en kilogramos por favor: ");
        double kg = OP.nextDouble();
        System.out.println("Introduzca su estatura en metros por favor:");
        double m = OP.nextDouble();
        double M = Math.pow(m,2);
        double imc = kg/M;
        System.out.println("Tu IMC es de: " + imc);
        if (imc <=18.9){
            System.out.println("Tas flaco mi loco");
        } else if (imc <= 24.9){
            System.out.println("Andas fitness guapo");
        } else if (imc<= 30){
            System.out.println("Tas obeso so puerco");
        } if (imc>30){
            System.out.println("Si haces cardio tus rodillas mueren");
        }
        OP.close();
    }
}
