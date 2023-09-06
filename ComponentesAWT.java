import java.awt.*;
public class ComponentesAWT extends Frame
{
	public ComponentesAWT()
	{
		Panel bottomPanel=new Panel();
		Panel centerPanel=new Panel();

		MenuBar mb=new MenuBar();
		Menu m=new Menu("Menu");

		m.add(new MenuItem("Menu seleccion 1"));
		m.add(new CheckboxMenuItem("Menu Seleccion 2"));
		m.add(new MenuItem("Menu Seleccion 3"));

		mb.add(m);
		setMenuBar(mb);

		bottomPanel.add(new TextField ("Campo de texto"));
		bottomPanel.add(new Button ("botón"));
		bottomPanel.add(new Checkbox ("Casilla de verificación"));

		Choice c=new Choice();
		c.addItem("Selección 1");
		c.addItem("Selección 2");
		c.addItem("Selección 3");
		bottomPanel.add(c);

		centerPanel.setLayout(new GridLayout(1,2));
		centerPanel.add(new MiCanvas());

		Panel p= new Panel();
		p.setLayout(new BorderLayout ());
		p.add("North", new Label("Etiqueta", Label.CENTER));
		p.add("Center", new TextArea("Zona de texto",5,20));
		centerPanel.add(p);

		setLayout(new BorderLayout());
		add("South", bottomPanel);
		add("Center",centerPanel);

		List l=new List(3,false);
		l.addItem("ListaItem 1");
		l.addItem("ListaItem 2");
		l.addItem("ListaItem 3");
		l.addItem("ListaItem 4");
		l.addItem("ListaItem 5");
		l.addItem("ListaItem 6");
		l.addItem("ListaItem 7");
		l.addItem("ListaItem 8");
		l.addItem("ListaItem 9");

		add("East",l);
	}

	public static void main(String args[])
	{
		ComponentesAWT window = new ComponentesAWT();
		window.setTitle("Algunos componentes de AWT");
		window.pack();
		window.show();
	}
}

