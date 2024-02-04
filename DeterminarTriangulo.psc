Algoritmo DeterminarTriangulo
    Escribir "Ingrese la longitud del primer lado del triángulo:"
    Leer lado1
    Escribir "Ingrese la longitud del segundo lado del triángulo:"
    Leer lado2
    Escribir "Ingrese la longitud del tercer lado del triángulo:"
    Leer lado3
	
    Si (lado1 + lado2 > lado3) Y (lado1 + lado3 > lado2) Y (lado2 + lado3 > lado1) Entonces
        Escribir "Se puede formar un triángulo con los lados dados"
    Sino
        Escribir "No se puede formar un triángulo con los lados dados"
    Fin Si
FinAlgoritmo