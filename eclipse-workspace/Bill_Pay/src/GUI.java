
import javax.swing.*; // Contains the core AWT graphics classes
import java.awt.BorderLayout;

public class GUI {

	static void billPayGUI() {
		
		JFrame frame = new JFrame("Bill Pay"); // Create and set up window
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Set default operation when window closes
		
		JPanel firstPanel = new JPanel(new BorderLayout()); // Creating the top panel in the JFrame
		//firstPanel.setBorder(null); // Allows customization for border of panel
		//firstPanel.add(null); // Will probably be used to add text boxes and buttons
		
		//https://docs.oracle.com/javase/tutorial/uiswing/components/toplevel.html
		
		// Displays the window
		frame.pack();
		frame.setVisible(true);
		
	}
	
}
