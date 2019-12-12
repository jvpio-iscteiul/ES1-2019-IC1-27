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
		frame.setSize(700, 700);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		addFrameContent();
		frame.pack();
		
	}
	
	public void open() {
		frame.setVisible(true);
	}
	
	private void addFrameContent() {
		
		JPanel panelWest = new JPanel();
		JPanel panelEast = new JPanel();
		JPanel panelLM = new JPanel();
		JPanel panelFE = new JPanel();
		JPanel lmButtons = new JPanel();
		JPanel lmTexts = new JPanel();
		JPanel feButtons = new JPanel();
		JPanel feTexts = new JPanel();
		
		panelEast.setLayout(new BorderLayout());
		panelWest.setLayout(new BorderLayout());
		panelLM.setLayout(new BorderLayout());
		panelFE.setLayout(new BorderLayout());
		lmButtons.setLayout(new BorderLayout());
		lmTexts.setLayout(new BorderLayout());
		feButtons.setLayout(new BorderLayout());
		feTexts.setLayout(new BorderLayout());
		
		JLabel labelLOC = new JLabel("LOC");
		JLabel labelCYCLO = new JLabel("CYCLO");
		JLabel labelATFD = new JLabel("ATFD");
		JLabel labelLAA = new JLabel("LAA");
		
		JTextField textLOC = new JTextField("0");
		JTextField textCYCLO = new JTextField("0");
		JTextField textATFD = new JTextField("0");
		JTextField textLAA = new JTextField("0");
		
		JButton buttonLM = new JButton("Definir Long Method");
		JButton buttonFE = new JButton("Definir Feature envy");
		
		frame.add(panelEast,BorderLayout.EAST);
		frame.add(panelWest, BorderLayout.WEST);
		panelEast.add(panelLM, BorderLayout.NORTH);
		panelEast.add(panelFE, BorderLayout.SOUTH);
		
		panelLM.add(buttonLM, BorderLayout.SOUTH);
		panelLM.add(lmButtons, BorderLayout.WEST);
		panelLM.add(lmTexts, BorderLayout.EAST);
		
		panelFE.add(buttonFE, BorderLayout.SOUTH);
		panelFE.add(feButtons, BorderLayout.WEST);
		panelFE.add(feTexts, BorderLayout.EAST);
		
		lmButtons.add(labelLOC, BorderLayout.NORTH);
		lmButtons.add(labelCYCLO, BorderLayout.SOUTH);
		lmTexts.add(textLOC, BorderLayout.NORTH);
		lmTexts.add(textCYCLO, BorderLayout.SOUTH);
		
		feButtons.add(labelATFD, BorderLayout.NORTH);
		feButtons.add(labelLAA, BorderLayout.SOUTH);
		feTexts.add(textATFD, BorderLayout.NORTH);
		feTexts.add(textLAA, BorderLayout.SOUTH);
	}
	
	
	public static void main(String[] args) {
		GUI frame = new GUI();
		frame.open();
		
	}


}
