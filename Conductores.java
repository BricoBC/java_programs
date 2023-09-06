import java.awt.*;
import java.awt.event.*;

public class Conductores
{
	private Frame f;
	private Label lkm,ll,lin,ltxt,lres;
	private TextField tkm, tl;
	private Button bCal,bHR,bEx;
	private Panel p, p1,p2, p3;

	public Conductores()
	{
		f = new Frame ("KILOMETRAJE");
		lkm = new Label("¿Cuántos kilometros a recorrido?");
		ll = new Label("¿Cuántos litros a utilizado?");
		lin=new Label("Sabiendo que va a una velocidad constante.");
		ltxt=new Label ("Un litro de gasolina le rinde para los siguientes kilometros:");
		lres = new Label ("");

		bCal = new Button("Calcular");
		bHR = new Button("Hacer recorrido");
		bEx = new Button("Salir");

		tkm = new TextField(10);
		tl = new TextField(10);

		p = new Panel();
		p1 = new Panel();
		p2 = new Panel();
		p3 = new Panel();
	}

	public void acomFrame()
	{
		bEx.addActionListener(new SalirBoton());
		bCal.addActionListener(new Calcular());


		p.setLayout(new GridLayout(2,2));
		p.add(lkm); p.add(tkm);
		p.add(ll); p.add(tl);
		f.add(p, BorderLayout.NORTH);

		p1.setLayout(new GridLayout(4,1));
		p1.add(bCal);
		p1.add(lin);
		p1.add(ltxt);
		p1.add(lres);
		f.add(p1, BorderLayout.CENTER);

		p3.setLayout(new GridLayout(2,1));
		p3.add(bHR);
		p3.add(bEx);
		f.add(p3, BorderLayout.SOUTH);

		f.setSize(410,300);
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

	class Calcular implements ActionListener
	{
		public void actionPerformed (java.awt.event.ActionEvent accEvent)
		{
		float km,lt,r;
		String res;
		km = Integer.parseInt(tkm.getText());
		lt = Integer.parseInt(tl.getText());
		r = km/lt;
		res = Double.toString(r);
		lres.setText(res);
		}
	}
	public static void main(String args[])
	{
		Conductores cond = new Conductores();
		cond.acomFrame();
	}	  
}