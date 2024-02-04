import java.util.Scanner;

public class NotaEstudiante {
    public static void main(String[]args){
        Scanner OP= new Scanner(System.in);
        System.out.println("Ingrese la nota del Estudiante: ");
        int Nota= OP.nextInt();
        if (Nota==5){
            System.out.println("Excelente");
        } 
        else if (Nota==4 || Nota==3){
            System.out.println("Aprobado");
        }
        else if (Nota==2 || Nota==1){
            System.out.println("Suspenso");
        }
        OP.close();
    }
}
