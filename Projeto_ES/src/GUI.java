import java.awt.BorderLayout;
import java.awt.FlowLayout;
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
		frame.setSize(800,800);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		this.cond = new Conditions();
		addFrameContent();
//		frame.pack();
	}
	
	
	public void open() {
		frame.setVisible(true);
		
	}
	
	
	private void addFrameContent() {
		
		JPanel panelWest = new JPanel();
		JPanel panelEast = new JPanel();
		JPanel panelProcura = new JPanel();
		JPanel panel3 = new JPanel();	
		
		
		JPanel centro = new JPanel();
		JScrollPane scroll = new JScrollPane(centro);
		frame.add(scroll,BorderLayout.CENTER);
		centro.setLayout(new FlowLayout());
		
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
				
				frame.setVisible(false);
				DefaultListModel<String> model = new DefaultListModel<String>();
				
				List<String> lista = cond.setLongMethod(textLOC, textCYCLO);
				
				
				for(String s : lista) 
					model.addElement(s);
				
				
				JList<String> list = new JList<String>(model);
				centro.add(list);
				
				frame.setVisible(true);
				
			}
		});
		
		
		JButton buttonFE = new JButton("Definir Feature envy");
		buttonFE.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				
				DefaultListModel<String> model = new DefaultListModel<String>();
				List<String> list = cond.setFeatureEnvy(textATFD, textLAA);
				
				for(String s : list)
					model.addElement(s);
				
				JList<String> lista = new JList<String>(model);
				centro.add(lista);
				
				frame.setVisible(true);
					
			}
		});
		
		
		JButton procuraIPlasma = new JButton("Procura IPlasma");
		procuraIPlasma.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				int i = cond.compareIPlasma();
				JLabel num = new JLabel("Numero de Metodos iPlasma:");
				JLabel valor = new JLabel();
				valor.setText(Integer.toString(i));
				
				centro.add(num);
				centro.add(valor);
				frame.setVisible(true);
				
			}
		});
		
		JButton procuraPMD = new JButton("Procura PMD");
		procuraPMD.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				int i = cond.comparePmd();
				JLabel num = new JLabel("Numero de Metodos PMD:");
				JLabel valor = new JLabel();
				valor.setText(Integer.toString(i));
				
				centro.add(num);
				centro.add(valor);
				frame.setVisible(true);
				
				
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
		
		panelProcura.add(procuraIPlasma, BorderLayout.NORTH);
		panelProcura.add(procuraPMD, BorderLayout.CENTER);
		panelProcura.add(procuraValores, BorderLayout.SOUTH);
		
		
		frame.add(centro, BorderLayout.CENTER);
		
	}
	
	
	public static void main(String[] args) {

		GUI frame = new GUI();
//		System.out.println(" agggaagggs");
//		System.out.println("oi");
		frame.open();
//		System.out.println("o");
	}

}