import java.util.Scanner;
public class BodyMassWeight {
    private static Double BodyMassWeightCalculator(){
        Scanner Scan=new Scanner(System.in);
        System.out.println("Bienvenido a la calculadora de Marco");
        System.out.println("Introduzca su peso en kilogramos:");
        double kg=Scan.nextDouble();
        System.out.println("Introduzca su altura:");
        double m=Scan.nextDouble();
        double M = Math.pow(m,2);
        double imc = kg/M;
        Scan.close();
        return imc;
    }
    private static void PrintResultsOfBodyMassWeight(){
        System.out.println("Tu Indice de Masa Corporal es de: " + BodyMassWeightCalculator());
    }
    public static void main (String[]args){
        PrintResultsOfBodyMassWeight();
    }
}
