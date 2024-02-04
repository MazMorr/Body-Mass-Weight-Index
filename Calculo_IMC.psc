Algoritmo Calculo_IMC
	Definir peso_kg, altura_m, IMC Como Real
	Escribir "Ingrese su peso en kilogramos: "
	Leer peso_kg
	Escribir "ingrese su estatura en metros: "
	Leer altura_m
	IMC= peso_kg / (altura_m * altura_m)
	Escribir "Su índice de masa corporal es: ", IMC
	Si IMC<=19.9 Entonces
		Escribir "EStás flaco"
	Si IMC<=24.9 Y IMC >19.9 Entonces
			Escribir "Estás fitness"
	Si IMC <= 30 Y IMC>= 25 Entonces
		Escribir "Estás obeso"
			FinSi
		FinSi
	Fin Si
	
FinAlgoritmo
