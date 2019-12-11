import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
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
		
//		JTextField locLimit = new JTextField();
//		JTextField cycloLImit = new JTextField();
		
//		JLabel lab1 = new JLabel("LOC");
//		JLabel lab2 = new JLabel("CYCLO");
		

//		JButton aplicarLimite = new JButton("Aplicar limites");
//		aplicarLimite.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				cond = new Conditions();
//				cond.setLongMethod(locLimit, cycloLImit);
//			}
//		});

//		JButton aplicarLimite = new JButton("Aplicar limites");
//		aplicarLimite.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				
//			}
//		});

		
//		panel.add(lab1);
//		panel.add(locLimit);
//		panel.add(lab2);
//		panel.add(cycloLImit);
		//panel.add(aplicarLimite);
		
		frame.add(panel, BorderLayout.WEST);
		
		JPanel panel4 = new JPanel();
		
		DefaultListModel<String> model = new DefaultListModel<String>();
//		JList<String> list = new JList<String>(model);
		
		//adicionar a lista qd feita
		
//		panel4.add(list);
		JScrollPane pane = new JScrollPane(panel4);
		
		frame.add(pane, BorderLayout.CENTER);
		
		JPanel panel1 = new JPanel();
		panel1.setLayout(new GridLayout(1,2));
		
		frame.add(panel1, BorderLayout.SOUTH);
		
		JPanel panel2 = new JPanel();
		panel2.setLayout(new GridLayout(4, 2));
		
		JTextField t1 = new JTextField("40");
		JTextField t2 = new JTextField("40");
		
		JButton loc = new JButton("LOC");
		loc.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				List<String> lista = cond.setLongMethod(t1, t2);
				
				for(String s : lista)
					model.addElement(s);
				
				JList<String> list = new JList<String>(model);
				panel4.add(list);
			}
		});
		
		JButton cyclo = new JButton("CYCLO");
		JButton atfd = new JButton("ATFD");
		JButton laa = new JButton("LAA");
		
//		JTextField tx1 = new JTextField();
		//tx1.setText(" " + cond.getDCI(tx1));
//		JTextField tx2 = new JTextField();
		//tx2.setText(" " + cond.getDII());
//		JTextField tx3 = new JTextField();
		//tx3.setText(" " + cond.getADCI());
//		JTextField tx4 = new JTextField();
		//tx4.setText(" " + cond.getADII());
		
		panel2.add(loc);
//		panel2.add(tx1);
		panel2.add(cyclo);
//		panel2.add(tx2);
		panel2.add(atfd);
//		panel2.add(tx3);
		panel2.add(laa);
//		panel2.add(tx4);
		
		frame.add(panel2, BorderLayout.EAST);
		
		JPanel panel3 = new JPanel();
		panel3.setLayout(new GridLayout(1, 4));
		
		JButton dci = new JButton("DCI");
		JButton dii = new JButton("DII");
		JButton adci = new JButton("ADCI");
		JButton adii = new JButton("ADII");
		
		panel3.add(dci);
		panel3.add(dii);
		panel3.add(adci);
		panel3.add(adii);
		
		frame.add(panel3, BorderLayout.SOUTH);
		
	}
	
	
	public static void main(String[] args) {
		GUI frame = new GUI();
		frame.open();
		
	}

}