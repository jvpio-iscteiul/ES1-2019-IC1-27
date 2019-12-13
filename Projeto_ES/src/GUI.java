import java.awt.BorderLayout;

import java.awt.FlowLayout;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
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
import javax.swing.event.AncestorListener;

public class GUI {

	private JFrame frame;
	private Conditions cond;

	public GUI() {
		frame = new JFrame();
		frame.setSize(800, 800);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		this.cond = new Conditions();
		addFrameContent();
//		frame.pack();
	}

	public void open() {
		frame.setVisible(true);

	}

	private void addFrameContent() {
		JFrame valores = new JFrame();
		
		JPanel panelWest = new JPanel();
		JPanel panelEast = new JPanel();
		JPanel panelProcura = new JPanel();
		JPanel panel3 = new JPanel();
		JPanel tituloTeste = new JPanel();
		JPanel tituloFiscal = new JPanel();
		JPanel valoresTeste = new JPanel();

		JPanel centro = new JPanel();
		JScrollPane scroll = new JScrollPane(centro);
		frame.add(scroll, BorderLayout.CENTER);
		centro.setLayout(new GridLayout(0,2));

		panelEast.setLayout(new GridLayout(3, 1));
		panelWest.setLayout(new BorderLayout());
		panelProcura.setLayout(new BorderLayout());
		panel3.setLayout(new GridLayout(1, 4));
		tituloTeste.setLayout(new GridLayout(1,2));
		tituloFiscal.setLayout(new GridLayout (4,1));
		valoresTeste.setLayout(new GridLayout(4,4));

		JButton dci = new JButton("DCI");
		JButton dii = new JButton("DII");
		JButton adci = new JButton("ADCI");
		JButton adii = new JButton("ADII");

		JLabel labelLOC = new JLabel("LOC");
		JLabel labelCYCLO = new JLabel("CYCLO");
		JLabel labelATFD = new JLabel("ATFD");
		JLabel labelLAA = new JLabel("LAA");
		JLabel labeliPlasma = new JLabel("iPlasma");
		JLabel labelPMD = new JLabel("PMD");
		JLabel labelDCI = new JLabel("DCI");
		JLabel labelDII = new JLabel("DII");
		JLabel labelADCI = new JLabel("ADCI");
		JLabel labelADII = new JLabel("ADII");

		JTextField textLOC = new JTextField("       ");
		JTextField textCYCLO = new JTextField("       ");
		JTextField textATFD = new JTextField("       ");
		JTextField textLAA = new JTextField("       ");
		JTextField iPlasmadci = new JTextField("       ");
		JTextField iPlasmadii = new JTextField("       ");
		JTextField iPlasmaadci = new JTextField("       ");
		JTextField iPlasmaadii = new JTextField("       ");
		JTextField PMDdci = new JTextField("       ");
		JTextField PMDdii = new JTextField("       ");
		JTextField PMDadci = new JTextField("       ");
		JTextField PMDadii = new JTextField("       ");
		
		tituloTeste.add(labeliPlasma);
		tituloTeste.add(labelPMD);
		tituloFiscal.add(labelDCI);
		tituloFiscal.add(labelDII);
		tituloFiscal.add(labelADCI);
		tituloFiscal.add(labelADII);
		valoresTeste.add(iPlasmadci);
		valoresTeste.add(PMDdci);
		valoresTeste.add(iPlasmadii);
		valoresTeste.add(PMDdii);
		valoresTeste.add(iPlasmaadci);
		valoresTeste.add(PMDadci);
		valoresTeste.add(iPlasmaadii);
		valoresTeste.add(PMDadii);
		

		panel3.add(dci);
		panel3.add(dii);
		panel3.add(adci);
		panel3.add(adii);
		
		valores.add(tituloTeste, BorderLayout.NORTH);
		valores.add(tituloFiscal, BorderLayout.WEST);
		valores.add(valoresTeste, BorderLayout.CENTER);
		frame.add(panel3, BorderLayout.SOUTH);

		JButton buttonLM = new JButton("Definir Long Method");

		buttonLM.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

			
				frame.setVisible(false);
				centro.removeAll();
				DefaultListModel<String> model = new DefaultListModel<String>();

				List<String> lista = cond.setLongMethod(textLOC, textCYCLO);

				for (String s : lista)
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
				centro.removeAll();

				DefaultListModel<String> model = new DefaultListModel<String>();
				List<String> list = cond.setFeatureEnvy(textATFD, textLAA);

				for (String s : list)
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
				centro.removeAll();
				int i = cond.getIPlasma();
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
				centro.removeAll();
				int i = cond.getPmd();
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
		JButton tabela = new JButton("Tabela EXCEL");
		tabela.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					String path = "Long-Method.xlsx";
					File file = new File(path);
					if (file.exists()) {
						Process pro = Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + path);
						pro.waitFor();
					} else {
						System.out.println("File does  not exist");
					}

				} catch (Exception e1) {
					System.out.println("e1");
				}

			}
		});

		dci.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JFrame frame2 = new JFrame();
				JPanel paneldci = new JPanel();
				paneldci.setLayout(new GridLayout(2, 1));

				JButton buttoniPLasma0 = new JButton("Testar IPlasma");
				buttoniPLasma0.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						System.out.println("LOADING...");
						System.out.println("DCI= " + cond.getDCI("buttoniPLasma0"));
						iPlasmadci.setText(Integer.toString(cond.getDCI("buttoniPlasma0")));
						valores.setVisible(true);
						valores.setSize(300, 150);

						frame2.setVisible(false);

					}
				});
				JButton buttonPMD0 = new JButton("Testar PMD");
				buttonPMD0.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						System.out.println("LOADING...");
						System.out.println("DCI= " + cond.getDCI("buttonPMD0"));
						PMDdci.setText(Integer.toString(cond.getDCI("buttoniPMD0")));
						valores.setVisible(true);
						valores.setSize(300, 150);
						
						frame2.setVisible(false);
					}
				});

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
				paneldii.setLayout(new GridLayout(2, 1));

				JButton buttoniPLasma1 = new JButton("Testar IPlasma");
				JButton buttonPMD1 = new JButton("Testar PMD");

				paneldii.add(buttoniPLasma1);
				buttoniPLasma1.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						System.out.println("LOADING...");
						System.out.println("DII= " + cond.getDII("buttoniPLasma1"));
						iPlasmadii.setText(Integer.toString(cond.getDII("buttoniPLasma1")));
						valores.setVisible(true);
						valores.setSize(300, 150);
						
						frame3.setVisible(false);
					}
				});
				paneldii.add(buttonPMD1);
				buttonPMD1.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						System.out.println("LOADING...");
						System.out.println("DII= " + cond.getDII("buttonPMD1"));
						PMDdii.setText(Integer.toString(cond.getDII("buttonPMD1")));
						valores.setVisible(true);
						valores.setSize(300, 150);

						frame3.setVisible(false);
					}
				});

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
				paneladci.setLayout(new GridLayout(2, 1));

				JButton buttoniPLasma2 = new JButton("Testar IPlasma");
				buttoniPLasma2.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						System.out.println("LOADING...");
						System.out.println("ADCI= " + cond.getADCI("buttoniPLasma2"));
						iPlasmaadci.setText(Integer.toString(cond.getADCI("buttoniPLasma2")));
						valores.setVisible(true);
						valores.setSize(300, 150);
						
						frame4.setVisible(false);
					}
				});
				JButton buttonPMD2 = new JButton("Testar PMD");
				buttonPMD2.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						System.out.println("LOADING...");
						System.out.println("ADCI= " + cond.getADCI("buttonPMD2"));
						PMDadci.setText(Integer.toString(cond.getADCI("buttonPMD2")));
						valores.setVisible(true);
						valores.setSize(300, 150);
						
						frame4.setVisible(false);
					}
				});

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
				paneladii.setLayout(new GridLayout(2, 1));

				JButton buttoniPLasma3 = new JButton("Testar IPlasma");
				JButton buttonPMD3 = new JButton("Testar PMD");

				paneladii.add(buttoniPLasma3);
				buttoniPLasma3.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						System.out.println("LOADING...");
						System.out.println("ADII= " + cond.getADII("buttoniPLasma3"));
						iPlasmaadii.setText(Integer.toString(cond.getADII("buttoniPLasma3")));
						valores.setVisible(true);
						valores.setSize(300, 150);
						
						frame5.setVisible(false);
					}
				});
				paneladii.add(buttonPMD3);
				buttonPMD3.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						System.out.println("LOADING...");
						System.out.println("ADII= " + cond.getADII("buttonPMD3"));
						PMDadii.setText(Integer.toString(cond.getADII("buttonPMD3")));
						valores.setVisible(true);
						valores.setSize(300, 150);
						
						
//						frame.setVisible(false);
//						centro.removeAll();
//						JLabel adii = new JLabel("ADII-PMD:");
//						JLabel valor = new JLabel();
//						int i = cond.getADII("buttoniPMD3");
//						valor.setText(Integer.toString(i));
//
//						centro.add(adii);
//						centro.add(valor);
//
//						frame.setVisible(true);
						frame5.setVisible(false);
					}
				});

				frame5.add(paneladii);
				frame5.setVisible(true);
				frame5.setSize(200, 150);

			}
		});

		frame.add(panelEast, BorderLayout.EAST);
		frame.add(panelWest, BorderLayout.WEST);
		panelEast.add(panelProcura);

		panelProcura.add(procuraIPlasma, BorderLayout.EAST);
		panelProcura.add(procuraPMD, BorderLayout.WEST);
		panelProcura.add(procuraValores, BorderLayout.NORTH);
		panelProcura.add(tabela, BorderLayout.SOUTH);

		frame.add(centro, BorderLayout.CENTER);

	}

	public static void main(String[] args) {

		GUI frame = new GUI();
		frame.open();

	}

}