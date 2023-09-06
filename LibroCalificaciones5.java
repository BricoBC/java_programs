public class LibroCalificaciones5
{
	private String nombreDelCurso;
	private String nombredelProfe;
	public LibroCalificaciones5(String nombre, String nombredelprofesor)
	{
		nombredelProfe=nombredelprofesor;
		nombreDelCurso=nombre;
	}
	public void establecerNombreDelCurso(String nombre)
	{
		nombreDelCurso=nombre;
	}
	public void establecerNombreDelProfe(String nombredelprofesor)
	{
		nombredelProfe=nombredelprofesor;
	}	
	public String obtenerNombreDelCurso()
	{
		return nombreDelCurso;
	}
	public String obtenerNombreDelProfesor()
	{
		return nombredelProfe;
	}
	public void Mostrarmensaje()
	{
		System.out.printf("bienvenido a libro calificaciones para \n %s! \n",obtenerNombreDelCurso());
		System.out.printf("Nombre de los docentes: \n %s! \n",obtenerNombreDelProfesor());
	}
}