import java.util.Scanner;

public class Calculator{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		// Titulo
		System.out.println("\t\tCALCULADORA DE ENTEROS");

		// Ingresar operacion
		System.out.println("\n[i] Escriba su operacion sin espacios, ejemplo: 8*3");
		System.out.print("\n> Ingrese la operación:  ");

		String operacion = sc.nextLine();

		// Usamos una expresion regular
		String[] partes = operacion.split("[\\+\\-\\*\\/\\%]");

		int num1 = Integer.parseInt(partes[0]);
		int num2 = Integer.parseInt(partes[1]);
		char operador = operacion.charAt(partes[0].length());
		int resultado = 0;

		// Realizamos la operación correspondiente
		switch (operador){
			case '+':
				resultado = add(num1, num2);
				break;
			case '-':
				resultado = sub(num1, num2);
				break;
			case '*':
				resultado = mult(num1, num2);
				break;
			case '/':
				resultado = div(num1, num2);
				break;
			case '%':
				resultado = div(num1, num2);
				break;
			default:
				System.out.println("[!] Operacion inválida");
		}

		System.out.print("\nResultado:  " + resultado);
	}
	
	public static int div(int x, int y){
		return x / y;
	}

	public static int mod(int x, int y){
		return x % y;
	}
	
	public static int mult(int a, int b) {
		return a*b;
	}

	public static int sub(int x, int y){
		return x-y;
	}

	public static int add(int x, int y) {
  	return x + y;
  }
}
