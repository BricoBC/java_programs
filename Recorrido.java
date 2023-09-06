import java.awt.*;
import java.awt.event.*;

public class Recorrido
{
	private Frame f;
	private Label in,preg,sab,fin, r;
	private TextField ga,li;
	private Button bEmp,bEx;
	private Panel p, p1,p2, p3;

	public Recorrido()
	{
		f = new Frame ("Recorrido");
		in = new Label("¿Cuántas gasolineras va a recorrer?");
		preg = new Label("¿Cuántos litros de gasolina le puso? En: ");
		sab = new Label("Gasolinera ");
		fin = new Label ("Su gasolina le rendira para los siguientes kilometros");
		r= new Label("");

		bEmp = new Button("Empezar");
		bEx = new Button("Salir");

		ga = new TextField(3);
		li = new TextField(3);

		p = new Panel();
		p1 = new Panel();
		p2 = new Panel();
		p3 = new Panel();
	}

	class Calcular implements ActionListener
	{
		public void actionPerformed (java.awt.event.ActionEvent accEvent)
		{
			float x,lt, res;
			int i;
			String re;
			x=Integer.parseInt(ga.getText());
			i=0;
			res=0;
			for(;i<=x;i++)
			{	
				i=i+1;
				sab = new Label("Gasolinera %s ",i);
				i=i-1;
				li=new TextField(3);
				lt=Integer.parseInt(li.getText());
				res=lt+res;
			}
			re=Double.toString(res); 
			r.setText(re);
		}
	}

	public void acomFrameRec()
	{
		bEx.addActionListener(new SalirBoton());
		bEmp.addActionListener(new Calcular());


		p.setLayout(new GridLayout(3,2));
		p.add(in); p.add(ga);
		p.add(bEmp); p.add(bEx);
		p.add(preg);
		f.add(p, BorderLayout.NORTH);

		p1.setLayout(new GridLayout(1,2));
		p1.add(sab); p1.add(li);
		f.add(p1, BorderLayout.CENTER);

		p2.setLayout(new GridLayout(1,2));
		p2.add(fin);
		f.add(p2, BorderLayout.SOUTH);

		f.setSize(480,250);
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter(){
			public void WindowClosing(WindowEvent we){
				System.exit(0);//no me agarra cerrarlo en la x de la esquina superior
			}
		});
	}

	class SalirBoton implements ActionListener
	{
		public void actionPerformed(java.awt.event.ActionEvent accionEvento){
			System.exit(0);
		}
	}

	public static void main(String args[])
	{
		Recorrido rec = new Recorrido();
		rec.acomFrameRec();
	}
	
}