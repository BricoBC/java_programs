import java.util.Scanner;

class PruebaAlumno 
{
	public static void main(String args[])
	{
		Alumno b = new Alumno();
		
		Scanner entrada =new Scanner(System.in);

		System.out.println("Ingresa tu nombre ");
		String nombreAlumnoCapturado = entrada.nextLine();

		System.out.println("¿Cual es tu direccion? ");
		String direccionAlumnoCapturada = entrada.nextLine();
		
		System.out.println("¿Que licenciatura estudias?");
		String licenciaturaAlumnoCapturada = entrada.nextLine();
		
		System.out.println("¿Cual es tu edad?");
		int edadAlumnoCapturada = entrada.nextInt();

		b.datos(nombreAlumnoCapturado, direccionAlumnoCapturada, edadAlumnoCapturada);
		b.descripcion();

		b.estudios(licenciaturaAlumnoCapturada);
		b.descripcion(nombreAlumnoCapturado, direccionAlumnoCapturada);
	}
}