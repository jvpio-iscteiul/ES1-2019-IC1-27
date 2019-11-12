import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

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
	}
	
	private void addFrameContent() {
		
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(4,1));
		
		JTextField t1 = new JTextField();
		JTextField t2 = new JTextField();
		JButton AplicarLimite = new JButton("Aplicar limites");
		panel.add(t1);
		panel.add(t2);
		panel.add(AplicarLimite);
		
		
		frame.setLayout(new BorderLayout());
		frame.add(panel, BorderLayout.WEST);
		
		JLabel label = new JLabel();
		frame.add(label, BorderLayout.CENTER);
		
		JPanel panel1 = new JPanel();
		panel1.setLayout(new GridLayout(1,2));
		JButton IPlasma = new JButton("IPlasma");
		JButton PMO = new JButton("PMO");
		panel1.add(IPlasma);
		panel1.add(PMO);
		
		frame.add(panel1, BorderLayout.SOUTH);
		
		
		
	}
	
	
	public static void main(String[] args) {
		GUI frame = new GUI();
		frame.open();
		
	}
	
	

//	private JFrame frame;
//
//	public GUI() {
//
//		frame = new JFrame();
//
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//		frame.setLayout(new BorderLayout());
//
//		addFrameContent();
//
//		open();
//	}
//
//
//	public void addFrameContent() {
//
//		JPanel painelTop = new JPanel();
//		painelTop.setLayout(new GridLayout(1,3));
//	}
//
//	public void open() {
//		frame.setSize(500, 300);
//		frame.setVisible(true);
//	}
//
//	public void ex() {
//	}


}
