import java.awt.BorderLayout;
import java.awt.Dimension;
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
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class GUI {
	
	private JFrame frame;
	private Conditions cond;
	
	public GUI() {
		frame = new JFrame();
		frame.setSize(500, 300);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		this.cond = new Conditions();
		addFrameContent();
		//frame.pack();
	}
	
	
	public void open() {
		frame.setVisible(true);
		
	}
	
	
	private void addFrameContent() {
		
		JPanel panelWest = new JPanel();
		JPanel panelEast = new JPanel();
		JPanel panelProcura = new JPanel();
		JPanel panel3 = new JPanel();

		panelEast.setLayout(new GridLayout(3,1));
		panelWest.setLayout(new BorderLayout());
		panelProcura.setLayout(new BorderLayout());
		panel3.setLayout(new GridLayout(1, 4));
		
		JButton dci = new JButton("DCI");
		JButton dii = new JButton("DII");
		JButton adci = new JButton("ADCI");
		JButton adii = new JButton("ADII");
		
		JLabel labelLOC = new JLabel("LOC");
		JLabel labelCYCLO = new JLabel("CYCLO");
		JLabel labelATFD = new JLabel("ATFD");
		JLabel labelLAA = new JLabel("LAA");
		
		JTextField textLOC = new JTextField("       ");
		JTextField textCYCLO = new JTextField("       ");
		JTextField textATFD = new JTextField("       ");
		JTextField textLAA = new JTextField("       ");
		
		panel3.add(dci);
		panel3.add(dii);
		panel3.add(adci);
		panel3.add(adii);
		
		frame.add(panel3, BorderLayout.SOUTH);
		
		JButton buttonLM = new JButton("Definir Long Method");

		buttonLM.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				List<String> lista = cond.setLongMethod(textLOC, textCYCLO);
			}
		});
		JButton buttonFE = new JButton("Definir Feature envy");
		JButton procuraIPlasma = new JButton("Procura IPlasma");
		procuraIPlasma.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				cond.compareIPlasma();
			}
		});
		JButton procuraPMD = new JButton("Procura PMD");
		procuraPMD.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				cond.comparePmd();
			}
		});
		JButton procuraValores = new JButton("Procura Valores do Utilizador");
		procuraValores.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JFrame frame1 = new JFrame();
				JPanel panelLM = new JPanel();
				JPanel panelFE = new JPanel();
								
				JPanel lmButtons = new JPanel();
				JPanel lmTexts = new JPanel();
				JPanel feButtons = new JPanel();
				JPanel feTexts = new JPanel();
				
				
				feButtons.setLayout(new BorderLayout());
				feTexts.setLayout(new BorderLayout());
				lmButtons.setLayout(new BorderLayout());
				lmTexts.setLayout(new BorderLayout());
		
				
				panelFE.add(buttonFE, BorderLayout.SOUTH);
				panelFE.add(feButtons, BorderLayout.WEST);
				panelFE.add(feTexts, BorderLayout.EAST);
				panelLM.add(buttonLM, BorderLayout.SOUTH);
				panelLM.add(lmButtons, BorderLayout.WEST);
				panelLM.add(lmTexts, BorderLayout.EAST);
				
				lmButtons.add(labelLOC, BorderLayout.NORTH);
				lmButtons.add(labelCYCLO, BorderLayout.SOUTH);
				lmTexts.add(textLOC, BorderLayout.NORTH);
				lmTexts.add(textCYCLO, BorderLayout.SOUTH);
				feButtons.add(labelATFD, BorderLayout.NORTH);
				feButtons.add(labelLAA, BorderLayout.SOUTH);
				feTexts.add(textATFD, BorderLayout.NORTH);
				feTexts.add(textLAA, BorderLayout.SOUTH);
				
				frame1.add(panelLM, BorderLayout.NORTH);
				frame1.add(panelFE, BorderLayout.SOUTH);
				frame1.setVisible(true);
				frame1.setSize(300, 150);
				
			}
		});
		JButton tabela = new JButton("Tabela");
		tabela.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JFrame frame1 = new JFrame();
				
				JPanel jpanel = new JPanel();
								
				JTable tabela = new JTable();
				tabela.setPreferredScrollableViewportSize(new Dimension(200,200));
				tabela.setFillsViewportHeight(true);
				JScrollPane scrollpane = new JScrollPane(tabela);
				jpanel.add(scrollpane);
				
				jpanel.add(tabela, BorderLayout.CENTER);
				
				
				frame1.add(jpanel, BorderLayout.CENTER);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame1.setVisible(true);
				frame1.setSize(1000, 600);
			}
		});
		
		procuraIPlasma.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
		}
		});
		
		procuraPMD.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
		}
		});
		
		tabela.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
		}
		});
		
		
		dci.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JFrame frame2 = new JFrame();
				JPanel paneldci = new JPanel();
				paneldci.setLayout(new GridLayout(2,1));
				
				JButton buttoniPLasma0 = new JButton("Testar IPlasma");
				JButton buttonPMD0 = new JButton("Testar PMD");
				
				paneldci.add(buttoniPLasma0);
				paneldci.add(buttonPMD0);
				
				frame2.add(paneldci);
				frame2.setVisible(true);
				frame2.setSize(200, 150);

				
				
				
		}
		});
		
		
		dii.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JFrame frame3 = new JFrame();
				JPanel paneldii = new JPanel();
				paneldii.setLayout(new GridLayout(2,1));
				
				JButton buttoniPLasma1 = new JButton("Testar IPlasma");
				JButton buttonPMD1 = new JButton("Testar PMD");
				
				paneldii.add(buttoniPLasma1);
				paneldii.add(buttonPMD1);
				
				frame3.add(paneldii);
				frame3.setVisible(true);
				frame3.setSize(200, 150);
				
		}
		});
		
		
		adci.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JFrame frame4 = new JFrame();
				JPanel paneladci = new JPanel();
				paneladci.setLayout(new GridLayout(2,1));
				
				JButton buttoniPLasma2 = new JButton("Testar IPlasma");
				JButton buttonPMD2 = new JButton("Testar PMD");
				
				paneladci.add(buttoniPLasma2);
				paneladci.add(buttonPMD2);
				
				frame4.add(paneladci);
				frame4.setVisible(true);
				frame4.setSize(200, 150);
				
		}
		});
		
		
		adii.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JFrame frame5 = new JFrame();
				JPanel paneladii = new JPanel();
				paneladii.setLayout(new GridLayout(2,1));
				
				JButton buttoniPLasma3 = new JButton("Testar IPlasma");
				JButton buttonPMD3 = new JButton("Testar PMD");
				
				paneladii.add(buttoniPLasma3);
				paneladii.add(buttonPMD3);
				
				frame5.add(paneladii);
				frame5.setVisible(true);
				frame5.setSize(200, 150);
				
		}
		});
		
		
		
		frame.add(panelEast,BorderLayout.EAST);
		frame.add(panelWest, BorderLayout.WEST);
		panelEast.add(panelProcura);
		
		panelProcura.add(procuraIPlasma, BorderLayout.EAST);
		panelProcura.add(procuraPMD, BorderLayout.WEST);
		panelProcura.add(procuraValores, BorderLayout.NORTH);
		panelProcura.add(tabela, BorderLayout.SOUTH);
		
		
//		frame.setLayout(new BorderLayout());
//		
//		JPanel panel = new JPanel();
//		panel.setLayout(new GridLayout(4,2));
//		
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
		
//		frame.add(panel, BorderLayout.WEST);
		
//		JPanel panel4 = new JPanel();
		
//		DefaultListModel<String> model = new DefaultListModel<String>();
//		JList<String> list = new JList<String>(model);
		
		//adicionar a lista qd feita
		
//		panel4.add(list);
//		JScrollPane pane = new JScrollPane(panel4);
		
//		frame.add(pane, BorderLayout.CENTER);
		
//		JPanel panel1 = new JPanel();
//		panel1.setLayout(new GridLayout(1,2));
		
//		frame.add(panel1, BorderLayout.SOUTH);
		
//		JPanel panel2 = new JPanel();
//		panel2.setLayout(new GridLayout(4, 2));
		
//		JTextField t1 = new JTextField("40");
//		JTextField t2 = new JTextField("40");
		
//		JButton loc = new JButton("LOC");
//		loc.addActionListener(new ActionListener() {
			
//			@Override
//			public void actionPerformed(ActionEvent e) {

//				List<String> lista = cond.setLongMethod(t1, t2);
				
//				for(String s : lista)
//					model.addElement(s);
				
//				JList<String> list = new JList<String>(model);
//				panel4.add(list);
//			}
//		});
		
//		JButton cyclo = new JButton("CYCLO");
//		JButton atfd = new JButton("ATFD");
//		JButton laa = new JButton("LAA");
		
//		JTextField tx1 = new JTextField();
		//tx1.setText(" " + cond.getDCI(tx1));
//		JTextField tx2 = new JTextField();
		//tx2.setText(" " + cond.getDII());
//		JTextField tx3 = new JTextField();
		//tx3.setText(" " + cond.getADCI());
//		JTextField tx4 = new JTextField();
		//tx4.setText(" " + cond.getADII());
		
//		panel2.add(loc);
//		panel2.add(tx1);
//		panel2.add(cyclo);
//		panel2.add(tx2);
//		panel2.add(atfd);
//		panel2.add(tx3);
//		panel2.add(laa);
//		panel2.add(tx4);
		
//		frame.add(panel2, BorderLayout.EAST);
		

		
	}
	
	
	public static void main(String[] args) {

		GUI frame = new GUI();
		System.out.println(" agggaagggs");
		System.out.println("oi");
		frame.open();
		System.out.println("o");
	}

}