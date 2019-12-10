import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class GUI {
	
	private JFrame frame;
	
	public GUI() {
		frame = new JFrame();
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		addFrameContent();
		frame.pack();
		
	}
	
	public void open() {
		frame.setVisible(true);
		frame.setSize(500, 300);
	}
	
	private void addFrameContent() {
		
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(4,1));
		
		JTextField locLimit = new JTextField();
		JTextField cycloLImit = new JTextField();
		JButton AplicarLimite = new JButton("Aplicar limites");
		panel.add(locLimit);
		panel.add(cycloLImit);
		panel.add(AplicarLimite);
		
		
		frame.setLayout(new BorderLayout());
		frame.add(panel, BorderLayout.WEST);
		
		JLabel label = new JLabel();
		frame.add(label, BorderLayout.CENTER);
		
		JPanel panel1 = new JPanel();
		panel1.setLayout(new GridLayout(1,2));
		JButton IPlasma = new JButton("IPlasma");
		JButton PMD = new JButton("PMD");
		panel1.add(IPlasma);
		panel1.add(PMD);
		
		frame.add(panel1, BorderLayout.SOUTH);
		
		
		
	}
	
	
	public static void main(String[] args) {
		GUI frame = new GUI();
		frame.open();
		
	}


}
