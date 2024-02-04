import java.util.Scanner;

public class DeterminarTriangulo {
    public static void main(String[] args) {
        Scanner OP = new Scanner(System.in);

        System.out.print("Ingrese la longitud del primer lado del triángulo: ");
        double lado1 = OP.nextDouble();

        System.out.print("Ingrese la longitud del segundo lado del triángulo: ");
        double lado2 = OP.nextDouble();

        System.out.print("Ingrese la longitud del tercer lado del triángulo: ");
        double lado3 = OP.nextDouble();

        if ((lado1 + lado2 > lado3) && (lado1 + lado3 > lado2) && (lado2 + lado3 > lado1)) {
            System.out.println("Se puede formar un triángulo con los lados dados");
        } else {
            System.out.println("No se puede formar un triángulo con los lados dados");
        }
        OP.close();
    }
}
