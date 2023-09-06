class Alumno extends Persona 
{
	protected String nombre;
	protected String licenciatura;
	protected String direccion;

	public void estudios(String licenciaturaLocal){
		licenciatura = licenciaturaLocal;
		System.out.println("Este metodo es de la subclase Alumno");
		System.out.println("Estas estudiando la carrera de "+ licenciatura);
	}

	public void descripcion(String nombreAlumno, String direccionAlumno){
		nombre = nombreAlumno;
		direccion = direccionAlumno;

		System.out.println("Este metodo descripcion es de la subclase Alumno");
		System.out.println("Hola "+ super.nombre + ", tienes " + edad + " años y vives en "+ direccion);
		System.out.println("Este nombre lo obtenemos de la variable nombre de la clase Alumno " + nombre);
		System.out.println("Esta es la direccion que obtenemos de la variable direccion de la clase Alumno:"+ direccion);
	}
}