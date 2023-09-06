import java.util.Scanner;
class PruebaPersona 
{
	public static void main(String args[])
	{
		Persona a = new Persona();
		Scanner entrada = new Scanner(System.in);

		System.out.println("Hola, ingresa tu nombre ");
		String nombreCapturado = entrada.nextLine();

		System.out.println("¿Cual es tu direccion? ");
		String direccionCapturada = entrada.nextLine();

		System.out.println("¿Cual es tu edad? ");
		int edadCapturada = entrada.nextInt();

		

		a.datos(nombreCapturado, direccionCapturada, edadCapturada);
		a.descripcion();
	}
}