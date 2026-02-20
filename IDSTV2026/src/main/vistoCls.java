/**
 * ============================================================================
 * DOCUMENTACIÓN GENERAL DEL CÓDIGO
 * ============================================================================
 *
 * - JLabel: componente para mostrar texto.
 * - Font: definición de tipografía.
 *
 * 3) CLASE
 * public class vistoCls extends JFrame
 * - La clase hereda de JFrame, por lo tanto representa una ventana.
 *
 * 4) CONSTRUCTOR
 * public vistoCls()
 * - Se ejecuta al crear una instancia de la clase.
 * - Contiene toda la configuración visual.
 *
 * --------------------------------------------------------------------------
 * CONFIGURACIÓN DE LA VENTANA
 * --------------------------------------------------------------------------
 *
 * - setTitle(): define el título de la ventana.
 * - setBounds(x, y, ancho, alto): define posición y tamaño.
 * - setDefaultCloseOperation(EXIT_ON_CLOSE): finaliza el programa al cerrar.
 *
 * --------------------------------------------------------------------------
 * CONTENEDOR Y LAYOUT
 * --------------------------------------------------------------------------
 *
 * - getContentPane().setBackground(Color.cyan):
 *   Cambia el color de fondo del contenedor principal.
 *
 * - setLayout(null):
 *   Desactiva el layout manager y obliga a usar posicionamiento manual
 *   mediante setBounds(). Esto da control total pero no es adaptable.
 *
 * - setOpacity(1.0f):
 *   Define la opacidad de la ventana.
 *   Puede no funcionar en todos los sistemas.
 *
 * --------------------------------------------------------------------------
 * ETIQUETA (JLabel)
 * --------------------------------------------------------------------------
 *
 * - Se crea un JLabel para mostrar el texto "Bienvenido".
 * - setBounds(): define tamaño y posición.
 * - setBackground() + setOpaque(true):
 *   setOpaque(true) es obligatorio para que el fondo se pinte.
 * - setFont(): define fuente, estilo y tamaño.
 * - setVerticalAlignment() y setHorizontalAlignment():
 *   Centran el texto dentro del área del JLabel.
 *
 * - add(tag_tittle):
 *   Agrega la etiqueta al contenedor para que sea visible.
 *
 * --------------------------------------------------------------------------
 * BLOQUE DE LÍNEAS COMENTADAS (CONFIGURACIONES Y PRUEBAS)
 * --------------------------------------------------------------------------
 *
 * - this.add(tag_title):
 *   Agregaría una segunda etiqueta (actualmente comentada).
 *
 * - this.setSize(500, 500):
 *   Define el tamaño de la ventana.
 *
 * - this.setLocation(200, 200):
 *   Define la posición de la ventana en pantalla.
 *
 * - tag_tittle.setSize(150, 30)
 * - tag_tittle.setLocation(175, 20)
 *   Son alternativas a setBounds().
 *
 * NOTA:
 * setBounds(x, y, width, height) equivale a:
 * setLocation(x, y) + setSize(width, height)
 *
 * Por eso estas líneas quedaron como pruebas.
 *
 * --------------------------------------------------------------------------
 * OBSERVACIONES IMPORTANTES
 * --------------------------------------------------------------------------
 *
 * - No se llama a setVisible(true); dentro del constructor.
 * - No existe método main() en esta clase.
 * - Para que la ventana se muestre, debe existir un main que cree la instancia
 *   y la haga visible.
 *
 * - Las interfaces Swing deben ejecutarse en el Event Dispatch Thread (EDT)
 *   usando SwingUtilities.invokeLater().
 * ============================================================================

*/
package main;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;


public class vistoCls extends JFrame {
	
	public vistoCls() {
		//----CONFIGURACION DE LA VENTANA----
		this.setTitle("Ventana");
		this.setBounds(200, 200, 500, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//----PANEL----
		this.getContentPane().setBackground(Color.cyan);//lo saca y asi permite al panel 
	    this.setLayout(null);
	    //----ETIQUETA----
		JLabel tag_tittle = new JLabel();
		tag_tittle.setText("Bienvenido");
		tag_tittle.setBounds(175, 20, 150, 30);
		tag_tittle.setBackground(Color.white);
		tag_tittle.setOpaque(true);
		tag_tittle.setFont(new Font("Arial", Font.PLAIN, 22));
		tag_tittle.setVerticalAlignment(JLabel.CENTER);
		tag_tittle.setHorizontalAlignment(JLabel.CENTER);
		//----AGREGAR ETIQUETA AL PANEL----
		this.add(tag_tittle);
		
				
		
		
	}

}
