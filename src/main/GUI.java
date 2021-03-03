package main;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class GUI extends JFrame implements ActionListener {
	
	String jug;
	private JPanel panel;
	private JMenuBar jmb;
	private JMenu opciones;
	private JMenuItem log, rec, reg;
	private JButton a, b, c, d;
	private JLabel titulo, nombre, raza, elemento, mensaje;
	private JTextField nombreTx;
	
	private static final long serialVersionUID = 1L;
	
	public GUI() {
		
		setSize(302, 339);
		setTitle("Cronometro");
		setLocationRelativeTo(null);
		setMinimumSize(new Dimension(300, 300));
		initComponent();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	private void initComponent() {
		
		panel = new JPanel();
		a = new JButton("A");
		b = new JButton("B");
		c = new JButton("C");
		d = new JButton("D");
		nombre = new JLabel("Nombre");
		mensaje = new JLabel("Log in para jugar.");
		raza = new JLabel("Raza");
		elemento = new JLabel("Elemento");
		titulo = new JLabel("HEROES");
		
		this.getContentPane().add(panel);
		
		panel.setLayout(null);
		a.setLayout(null);
		b.setLayout(null);
		c.setLayout(null);
		d.setLayout(null);
		nombre.setLayout(null);
		mensaje.setLayout(null);
		raza.setLayout(null);
		elemento.setLayout(null);
		titulo.setLayout(null);

		
		a.setBounds(44, 200, 20, 20);
		b.setBounds(108, 200, 20, 20);
		c.setBounds(172, 200, 20, 20);
		d.setBounds(256, 200, 20, 20);
		nombre.setBounds(10, 10, 110, 20);
		mensaje.setBounds(30, 170, 200, 20);
		raza.setBounds(100, 80, 80, 20);
		elemento.setBounds(10, 35, 80, 20);
		titulo.setBounds(20, 100, 200, 20);
		
		
			
		jmb.add(opciones);
		opciones.add(reg);
		opciones.add(rec);
		opciones.add(log);
		panel.add(a);
		panel.add(b);
		panel.add(c);
		panel.add(d);
		panel.add(nombre);
		panel.add(mensaje);
		panel.add(raza);
		panel.add(elemento);
		panel.add(titulo);
		
		/*
		a.setEnabled(false);
		b.setEnabled(false);
		c.setEnabled(false);
		d.setEnabled(false);
		
		if (false) {
			
			a.setEnabled(true);
			b.setEnabled(true);
			c.setEnabled(true);
			d.setEnabled(true);
		}

		ActionListener a_ = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			}
		};
		
		ActionListener b_ = new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				System.out.print("");
			}
		};
		
		ActionListener c_ = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			}
		};
		
		ActionListener d_ = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			}
		};
		
		a.addActionListener(a_);
		b.addActionListener(b_);
		c.addActionListener(c_);
		d.addActionListener(d_);*/
	}

	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}


	



