import java.util.Scanner;
class Persona 
{
	protected String nombre, direccion;
	protected int edad;

	public void datos(String nombreLocal, String direccionLocal, int edadLocal)
	{
		nombre = nombreLocal;
		edad = edadLocal;
	    direccion = direccionLocal;
	}

	public void descripcion()
	{
		System.out.println("Este metodo es de la super clase Persona");
		System.out.println("Hola " + nombre + " tienes " + edad + " años y vives en:" + direccion);
	}
}