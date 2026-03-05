package ej05_menu;
import java.awt.*;
import javax.swing.*;


	public class Menu extends JFrame {
		
		public Menu() {
		JMenuBar barra = new JMenuBar();
		this.setJMenuBar(barra);
		
		JMenu menuPrincipal = new JMenu ("Archivo");
		barra.add(menuPrincipal);
		
		JMenuItem opc1 = new JMenuItem ("Abrir");
		menuPrincipal.add(opc1);
		
		JMenuItem opc2 = new JMenuItem ("Nuevo");
		menuPrincipal.add(opc2);
		
		JMenuItem opc3 = new JMenuItem ("Cerrar");
		menuPrincipal.add(opc3);
		
		menuPrincipal.addSeparator();
		
		JMenu menuSecundario = new JMenu ("Guardar");
		menuPrincipal.add(menuSecundario);
		
		JMenuItem mSpc1 = new JMenuItem ("Guadar");
		menuSecundario.add(mSpc1);
		
		JMenuItem mSpc2 = new JMenuItem ("Guardar como");
		menuSecundario.add(mSpc2);
		
		JMenuItem mSpc3 = new JMenuItem ("Copiar y guardar");
		menuSecundario.add(mSpc3);
		
		  // ---------- CONFIG VENTANA ----------
	    this.setTitle("Usuarios - GAMEART");
	    this.setBounds(100, 50, 1000, 900);
	    this.setBackground(Color.GRAY);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setLayout(null);
	    Image GUAVA = new ImageIcon(
	    	    getClass().getResource("/ej02_login/GUAVA.png")
	    	).getImage();
	    this.setIconImage(GUAVA);

	    JPanel users_panel = new JPanel();
	    users_panel.setBounds(50, 50, 900, 500);
	    users_panel.setLayout(null);
	    users_panel.setBackground(Color.white);
	    this.add(users_panel);
		}
		
}
