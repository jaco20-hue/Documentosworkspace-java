package ej03_register;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;

public class RegisterPanel extends JFrame {
	
	public RegisterPanel() {
		
		  // ---------- CONFIG VENTANA ----------
        this.setTitle("Registro");
        this.setBounds(100, 50, 500, 700);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        Image GUAVA = new ImageIcon(
        	    getClass().getResource("/ej02_login/GUAVA.png")
        	).getImage();
        this.setIconImage(GUAVA);

        JPanel container = new JPanel();
        container.setBounds(0, 0, 500, 700);
        container.setLayout(null);
        container.setBackground(Color.white);
        this.add(container);

        // -------- BORDE ------------------
        container.setBorder(
                BorderFactory.createEmptyBorder(20, 20, 20, 20)
        );

        // ---------- LOGO PEQUEÑO ----------
        ImageIcon logoIcon = new ImageIcon(
                getClass().getResource("/ej02_login/Logo.png"));

        Image img = logoIcon.getImage()
                .getScaledInstance(45, 45, Image.SCALE_SMOOTH);

        JLabel logo = new JLabel(new ImageIcon(img));
        logo.setBounds(220, 15, 45, 45);
        container.add(logo);
        
        JLabel tag_title2 = new JLabel("GAMEART");
        tag_title2.setSize(260, 45);
        tag_title2.setLocation(150, 10);
        tag_title2.setBackground(Color.white);
        //tag_title2.setOpaque(true);
        tag_title2.setFont(new Font("Helvetica", Font.BOLD,10));
        tag_title2.setVerticalAlignment(JLabel.CENTER);
        tag_title2.setHorizontalAlignment(JLabel.CENTER);
        container.add(tag_title2);
         
        
        // ---------- TITULO ----------
        JLabel title = new JLabel("Crear cuenta", SwingConstants.CENTER);
        title.setBounds(100, 60, 300, 40);
        title.setFont(new Font("Helvetica", Font.BOLD, 28));
        container.add(title);

        // 🔹 Borde estilo input
        Border inputBorder = BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(Color.gray, 1),
                BorderFactory.createEmptyBorder(5, 10, 5, 10)
        );

        // ---------- USUARIO ----------
        JLabel userLabel = new JLabel("Usuario");
        userLabel.setBounds(60, 110, 200, 20);
        container.add(userLabel);

        JTextField userField = new JTextField();
        userField.setBounds(60, 130, 360, 35);
        userField.setBorder(inputBorder);
        container.add(userField);

        // ---------- CORREO ----------
        JLabel emailLabel = new JLabel("Correo electrónico");
        emailLabel.setBounds(60, 175, 200, 20);
        container.add(emailLabel);

        JTextField emailField = new JTextField();
        emailField.setBounds(60, 195, 360, 35);
        emailField.setBorder(inputBorder);
        container.add(emailField);

        // ---------- CONTRASEÑA ----------
        JLabel passLabel = new JLabel("Contraseña");
        passLabel.setBounds(60, 240, 200, 20);
        container.add(passLabel);

        JPasswordField passField = new JPasswordField();
        passField.setBounds(60, 260, 170, 35);
        passField.setBorder(inputBorder);
        container.add(passField);

        JLabel confirmLabel = new JLabel("Confirmar");
        confirmLabel.setBounds(250, 240, 200, 20);
        container.add(confirmLabel);

        JPasswordField confirmField = new JPasswordField();
        confirmField.setBounds(250, 260, 170, 35);
        confirmField.setBorder(inputBorder);
        container.add(confirmField);

        // ---------- BIO ----------
        JTextArea bio = new JTextArea();
        bio.setLineWrap(true);
        bio.setWrapStyleWord(true);

        JScrollPane bioScroll = new JScrollPane(bio);
        bioScroll.setBounds(60, 320, 360, 80);

        // ------- BORDE TITULO ------------------
        bioScroll.setBorder(
                BorderFactory.createTitledBorder("Sobre mi")
        );

        container.add(bioScroll);

        // ---------- PREFERENCIAS ----------
        JPanel prefPanel = new JPanel();
        prefPanel.setLayout(null);
        prefPanel.setBounds(60, 420, 360, 70);
        prefPanel.setBackground(Color.white);

        prefPanel.setBorder(
                BorderFactory.createTitledBorder("Preferencias")
        );

        JCheckBox dulce = new JCheckBox("Peliculas");
        dulce.setBounds(20, 25, 80, 20);
        dulce.setBackground(Color.white);

        JCheckBox salado = new JCheckBox("Libros");
        salado.setBounds(130, 25, 80, 20);
        salado.setBackground(Color.white);

        JCheckBox saludable = new JCheckBox("Arte");
        saludable.setBounds(240, 25, 100, 20);
        saludable.setBackground(Color.white);

        prefPanel.add(dulce);
        prefPanel.add(salado);
        prefPanel.add(saludable);

        container.add(prefPanel);

        // ---------- BOTÓN ----------
        JButton createBtn = new JButton("Crear cuenta");
        createBtn.setBounds(150, 510, 200, 40);
        createBtn.setBackground(new Color(40, 167, 69));
        createBtn.setForeground(Color.white);
        createBtn.setFocusPainted(false);

        //------------- BOTÓN BORDE -----------
        createBtn.setBorder(
                BorderFactory.createLineBorder(new Color(30, 140, 55), 2)
        );

        container.add(createBtn);

        // ---------- LINK ----------
        JButton link = new JButton("<html><u>¿Ya tienes cuenta? Inicia sesión</u></html>");
        link.setBounds(110, 555, 280, 30);
        link.setBorderPainted(false);
        link.setContentAreaFilled(false);
        link.setForeground(Color.blue);

        container.add(link);
        
       
        
        //size
        //location
        //opaque
        //background
        
        
        //titulo
        
        //label name
        //input name
        //label text area
        //input bio texarea
        //label terms
        //input terms
        //label preferenc
        //input preferences
        //combo
        //
	
		
		
	}
	
}

