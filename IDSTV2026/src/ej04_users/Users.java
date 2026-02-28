package ej04_users;

import java.awt.*;
import javax.swing.*;


public class Users extends JFrame {
	
	public Users() {
		
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
    
    JLabel tag_title22 = new JLabel("GAMEART Users");
    tag_title22.setSize(300, 900);
    tag_title22.setLocation(70,-400);
    tag_title22.setBackground(Color.white);
    //tag_title2.setOpaque(true);
    tag_title22.setFont(new Font("Helvetica", Font.BOLD,30));
    tag_title22.setVerticalAlignment(JLabel.CENTER);
    tag_title22.setHorizontalAlignment(JLabel.CENTER);
    users_panel.add(tag_title22);
    
    String [] table_head = {"No.Control","Nombre","Apellido","Correo electronico","Semestre","Carrera","Acciones"};
	Object [][] table_body = {
			{"20230001", "Ana", "Martínez", "ana.martinez23@correo.com", "1", "Ingeniería en Sistemas", "Editar / Eliminar"},
		    {"20230002", "Luis", "Hernández", "lhernandez_02@mail.com", "3", "Arquitectura", "Editar / Eliminar"},
		    {"20230003", "Sofía", "Ramírez", "sofia.ramirez@gmail.com", "5", "Contaduría Pública", "Editar / Eliminar"},
		    {"20230004", "Carlos", "López", "carloslpz04@outlook.com", "2", "Derecho", "Editar / Eliminar"},
		    {"20230005", "Mariana", "Torres", "mariana.torres98@mail.com", "7", "Psicología", "Editar / Eliminar"},
		    {"20230006", "Diego", "Gómez", "diego.gomez@correo.com", "4", "Administración", "Editar / Eliminar"},
		    {"20230007", "Valeria", "Sánchez", "valeria.sanchez@mail.com", "6", "Ingeniería Industrial", "Editar / Eliminar"},
		    {"20230008", "Jorge", "Díaz", "jdiaz_08@gmail.com", "8", "Medicina", "Editar / Eliminar"},
		    {"20230009", "Fernanda", "Cruz", "fernanda.cruz@correo.com", "2", "Diseño Gráfico", "Editar / Eliminar"},
		    {"20230010", "Miguel", "Vargas", "miguel.vargas@mail.com", "9", "Ingeniería Civil", "Editar / Eliminar"}
		};
	
				JTable students = new JTable (table_body,table_head);
				JScrollPane final_table =new JScrollPane (students);
				final_table.setBounds(100,100,700,150);
				users_panel.add(final_table);
			
			    JPanel counterPanel = new JPanel(null);
		        counterPanel.setBounds(700, 100, 320, 45);
		        counterPanel.setBackground(new Color(245, 245, 245));
		        users_panel.add(counterPanel);
		        
		        JLabel counterTitle = new JLabel("Registros:");
		        counterTitle.setBounds(690, 26, 100, 20);
		        counterTitle.setFont(new Font("Helvetica", Font.BOLD, 12));
		        users_panel.add(counterTitle);
		        
		        JLabel counterHint = new JLabel("40");
		        counterHint.setBounds(760, 5, 90, 60);
		        counterHint.setFont(new Font("Helvetica", Font.BOLD, 40));
		        counterHint.setForeground(Color.BLACK);
		        users_panel.add(counterHint);
		        
		        JButton counterHintButton = new JButton("Editar");
		        counterHintButton.setBounds(580, 70, 100, 20);
		        counterHintButton.setFont(new Font("Helvetica", Font.PLAIN, 11));
		        counterHintButton.setForeground(Color.gray);
		        users_panel.add(counterHintButton);
		        
		        JButton downloadButton = new JButton("Descargar");
		        downloadButton.setBounds(700, 70, 100, 20);
		        downloadButton.setFont(new Font("Helvetica", Font.PLAIN, 11));
		        downloadButton.setForeground(Color.gray);
		        users_panel.add(downloadButton);
		        
		        
		        ImageIcon logoIcon = new ImageIcon(
		                getClass().getResource("/ej02_login/Logo.png"));

		        Image img = logoIcon.getImage()
		                .getScaledInstance(45, 45, Image.SCALE_SMOOTH);

		        JLabel logo = new JLabel(new ImageIcon(img));
		        logo.setBounds(400, 15, 45, 900);
		        users_panel.add(logo);
		        
		        JLabel tag_title2 = new JLabel("GAMEART");
		        tag_title2.setSize(650, 900);
		        tag_title2.setLocation(150, 10);
		        tag_title2.setBackground(Color.white);
		        //tag_title2.setOpaque(true);
		        tag_title2.setFont(new Font("Helvetica", Font.BOLD,10));
		        tag_title2.setVerticalAlignment(JLabel.CENTER);
		        tag_title2.setHorizontalAlignment(JLabel.CENTER);
		        users_panel.add(tag_title2);
		        
		        
		         
		        
		        
			
	}
	
	
	
	

}
