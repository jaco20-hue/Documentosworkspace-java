package ej02_login;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.*;

public class LoginVentana extends JFrame {
	
	public LoginVentana() {
		
		//---------- CONFIG VENTANA ----------
        this.setTitle("Login");
        this.setBounds(100, 50, 500, 700);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setBackground(Color.black);
        this.setLayout(null);
        this.setResizable(true);
        Image GUAVA = new ImageIcon(
        	    getClass().getResource("/ej02_login/GUAVA.png")
        	).getImage();
        this.setIconImage(GUAVA);

        //---------- PANEL CONTENEDOR ----------
        JPanel login_container = new JPanel();
        login_container.setBounds(0,0,500,700);
        //login_container.setLocation(-10, 0);
        login_container.setBackground(Color.white);
        login_container.setLayout(null);
        this.add(login_container);
        this.repaint();
        
        ImageIcon logoIcon = new ImageIcon(
            getClass().getResource("/ej02_login/Logo.png"));

        Image img = logoIcon.getImage()
                .getScaledInstance(120, 120, Image.SCALE_SMOOTH);

        JLabel Logo = new JLabel(new ImageIcon(img));
        Logo.setSize(120, 120);
        Logo.setLocation(190,5 ); 
        login_container.add(Logo);

        //---------- TITULO ----------
        JLabel tag_title = new JLabel("Iniciar sesión");
        tag_title.setSize(260, 45);
        tag_title.setLocation(140, 120);
        tag_title.setBackground(Color.white);
        tag_title.setOpaque(true);
        tag_title.setFont(new Font("Helvetica", Font.BOLD,35));
        tag_title.setVerticalAlignment(JLabel.CENTER);
        tag_title.setHorizontalAlignment(JLabel.CENTER);
        login_container.add(tag_title);
        
        
      //---------- TITULO----------
        JLabel tag_title2 = new JLabel("GAMEART");
        tag_title2.setSize(260, 45);
        tag_title2.setLocation(270, 40);
        tag_title2.setBackground(Color.white);
        tag_title2.setOpaque(true);
        tag_title2.setFont(new Font("Helvetica", Font.BOLD,10));
        tag_title.setVerticalAlignment(JLabel.CENTER);
        tag_title.setHorizontalAlignment(JLabel.CENTER);
        login_container.add(tag_title2);

        //---------- TAG MAIL ----------
        JLabel email_label = new JLabel("Ingresa tu correo electronico");
        email_label.setSize(200, 25);
        email_label.setLocation(90, 175);
        login_container.add(email_label);

        //---------- INPUT MAIL ----------
        JTextField email_input = new JTextField();
        email_input.setSize(340, 30);
        email_input.setLocation(90, 200);
        login_container.add(email_input);

        //---------- TAG PASSWORD ----------
        JLabel password_label = new JLabel("Contraseña");
        password_label.setSize(200, 25);
        password_label.setLocation(90, 245);
        login_container.add(password_label);

        //---------- INPUT PASSWORD ----------
        JPasswordField password_input = new JPasswordField();
        password_input.setSize(340, 30);
        password_input.setLocation(90, 270);
        login_container.add(password_input);

        //---------- CHECKBOX ----------
        JCheckBox rememberme_check = new JCheckBox("Recordarme");
        rememberme_check.setSize(150, 30);
        rememberme_check.setLocation(90, 315);
        rememberme_check.setBackground(Color.white);
        login_container.add(rememberme_check);

        //---------- BOTON ----------
        JButton access_btn = new JButton("Continuar");
        access_btn.setSize(180, 35);
        access_btn.setLocation(170, 360);
        access_btn.setBackground(new Color(40, 167, 69));
        access_btn.setForeground(Color.white);
        
        login_container.add(access_btn);
        
       //---------- BOTON LINK ----------
        JButton link = new JButton("<html><u>¿Olvidaste tu contraseña?</u></html>");
        link.setBorderPainted(false);
        link.setContentAreaFilled(false);
        link.setFocusPainted(false);
        link.setForeground(Color.blue);
        link.setSize(280, 30);
        link.setLocation(120, 405);
        login_container.add(link);
        
        JButton link2 = new JButton("<html><u>Crear cuenta</u></html>");
        link2.setBorderPainted(false);
        link2.setContentAreaFilled(false);
        link2.setFocusPainted(false);
        link2.setForeground(Color.blue);
        link2.setSize(280, 30);
        link2.setLocation(120, 500);
        login_container.add(link2);
        
        
        
        this.repaint();
      
	}
}
