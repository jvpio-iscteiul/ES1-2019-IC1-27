import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class GUI {
	
	
	private JFrame frame;
	private Conditions cond;
	
	
	
	public GUI() {
		frame = new JFrame();
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		this.cond = new Conditions();
		addFrameContent();
		frame.pack();
	}
	
	
	public void open() {
		frame.setVisible(true);
		frame.setSize(500, 300);
	}
	
	
	private void addFrameContent() {
		
		frame.setLayout(new BorderLayout());
		
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(4,2));
		
		JTextField locLimit = new JTextField();
		JTextField cycloLImit = new JTextField();
		
		JLabel lab1 = new JLabel("LOC");
		JLabel lab2 = new JLabel("CYCLO");
		
		JButton aplicarLimite = new JButton("Aplicar limites");
		aplicarLimite.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				cond.setLongMethod(locLimit, cycloLImit);
			}
		});
		
		panel.add(lab1);
		panel.add(locLimit);
		panel.add(lab2);
		panel.add(cycloLImit);
		panel.add(aplicarLimite);
		
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
		
		JPanel panel2 = new JPanel();
		panel2.setLayout(new GridLayout(4, 2));
		
		JLabel lab3 = new JLabel("DCI");
		JLabel lab4 = new JLabel("DII");
		JLabel lab5 = new JLabel("ADCI");
		JLabel lab6 = new JLabel("ADII");
		
		JTextField tx1 = new JTextField();
		//tx1.setText(" " + cond.getDCI(tx1));
		JTextField tx2 = new JTextField();
		//tx2.setText(" " + cond.getDII());
		JTextField tx3 = new JTextField();
		//tx3.setText(" " + cond.getADCI());
		JTextField tx4 = new JTextField();
		//tx4.setText(" " + cond.getADII());
		
		panel2.add(lab3);
		panel2.add(tx1);
		panel2.add(lab4);
		panel2.add(tx2);
		panel2.add(lab5);
		panel2.add(tx3);
		panel2.add(lab6);
		panel2.add(tx4);
		
		frame.add(panel2, BorderLayout.EAST);
	}
	
	
	public static void main(String[] args) {
		System.out.println("AAAAAA");
		GUI frame = new GUI();
		System.out.println("BBBBBBBBB");
		frame.open();
		System.out.println("CCCCCCCCCCC");		
	}

}
