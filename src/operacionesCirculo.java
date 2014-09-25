import java.util.Scanner;

public class operacionesCirculo {

	public static void main (String args[]) {

		float numero1, resultadoArea, resultadoCircunferencia;
		Circulos operaciones = new Circulos();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("\nIngresa un número: ");
		numero1 = sc.nextFloat(); // nextDouble --> Cambiar todos los float de los dos archivos a double
		operaciones.setArea(numero1);
		operaciones.setCircunferencia(numero1);

		resultadoArea = operaciones.getArea();
		resultadoCircunferencia = operaciones.getCircunferencia();


		System.out.println("\nEl resultado del AREA es: " + resultadoArea);
		System.out.println("\nEl resultado de la CIRCUNFERENCIA es: " + resultadoCircunferencia);
	
		//System.out.println("\n\nEGUN ONA IZAN!!\n");
	}
}
