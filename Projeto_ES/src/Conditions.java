import java.io.BufferedReader;
import java.io.FilterInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JTextField;

public class Conditions {

	private boolean is_long_method;
	private boolean is_feature_envy;
	private BufferedReader in;
	private static final int LENGTH = 20;
	private static final int LOC = 4;
	private static final int CYCLO = 5;
	private static final int ATFD = 6;
	private static final int LAA = 7;
	private static final int METHOD = 3;
	private static final int PMD = 10;
	private static final int IPLASMA = 9;
	private static final int IS_LONG_METHOD = 8;
	private ReadCellInteger rci;
	private ReadCellBoolean rcb;
	private ReadCellString rcs;
	private List<String> lista1;
	private List<String> lista2;



	public Conditions() {
		this.rci = new ReadCellInteger();
		this.rcb = new ReadCellBoolean();
		this.rcs = new ReadCellString();
		this.lista1 = new ArrayList<String>();
		this.lista2 = new ArrayList<String>();
	}

	public List<String> setLongMethod(JTextField locLimit, JTextField cycloLImit) {

		
//	E preciso isto retornar uma lista com os nome dos metodos para depois eles aparecerem na GUI, mesmo na setFeatureEnvy
		String ll = locLimit.getText().trim();
		int x = Integer.parseInt(ll);
		String cl = cycloLImit.getText().trim();
		int y = Integer.parseInt(cl);
		for (int i = 1; i < LENGTH; i++) {
			int lim1 = rci.ReadCellData(i, LOC);
			int lim2 = rci.ReadCellData(i, CYCLO);
			if (lim1 > x && lim2 > y) {
				lista1.add("TRUE");
			}
			
			else
				lista1.add("FALSE");
		}
		return lista1;
	}

	public List<String> setFeatureEnvy(JTextField locLimit, JTextField cycloLImit) {
		String ll = locLimit.getText().trim();
		int x = Integer.parseInt(ll);
		String cl = cycloLImit.getText().trim();
		int y = Integer.parseInt(cl);
		for (int i = 1; i < LENGTH; i++) {
			int lim1 = rci.ReadCellData(i, ATFD);

			int lim2 = rci.ReadCellData(i, LAA);
			if (lim1 > x && lim2 > y) 
				lista2.add(rcs.ReadCellData(i, METHOD));

			String lim21 = rcs.ReadCellData(i, LAA);
			int lim2Int = Integer.parseInt(lim21);
			if (lim1 > x && lim2Int < y) 
				lista2.add("TRUE");
			else
				lista2.add("FALSE");

		}
		return lista2;
	}


	public int getDCI(String butao) {
		int count = 0;
		if (butao.contains("buttoniPLasma0")) {
			for (int i = 1; i < LENGTH; i++) {
				boolean iPlasma = rcb.ReadCellData(i, IPLASMA);
				boolean is_long_method = rcb.ReadCellData(i, IS_LONG_METHOD);
				if(is_long_method == true && iPlasma == true) {
					count++;
				}
			}
		} else {
			for (int i = 1; i < LENGTH; i++) {
				boolean pmd = rcb.ReadCellData(i, PMD);
				boolean is_long_method = rcb.ReadCellData(i, IS_LONG_METHOD);
				if(is_long_method == true && pmd == true) {
					count++;
				}
			}
		}
		return count;
	}
	
	public int getDII(String butao) {
		int count = 0;
		if (butao.contains("buttoniPLasma1")) {
			for (int i = 1; i < LENGTH; i++) {
				boolean iPlasma = rcb.ReadCellData(i, IPLASMA);
				boolean is_long_method = rcb.ReadCellData(i, IS_LONG_METHOD);
				if(is_long_method == true && iPlasma == false) {
					count++;
				}
			}
		} else {
			for (int i = 1; i < LENGTH; i++) {
				boolean pmd = rcb.ReadCellData(i, PMD);
				boolean is_long_method = rcb.ReadCellData(i, IS_LONG_METHOD);
				if(is_long_method == true && pmd == false) {
					count++;
				}
			}
		}
		return count;
	}
	
	public int getADCI(String butao) {
		int count = 0;
		if (butao.contains("buttoniPLasma2")) {
			for (int i = 1; i < LENGTH; i++) {
				boolean iPlasma = rcb.ReadCellData(i, IPLASMA);
				boolean is_long_method = rcb.ReadCellData(i, IS_LONG_METHOD);
				if(is_long_method == false && iPlasma == false) {
					count++;
				}
			}
		} else {
			for (int i = 1; i < LENGTH; i++) {
				boolean pmd = rcb.ReadCellData(i, PMD);
				boolean is_long_method = rcb.ReadCellData(i, IS_LONG_METHOD);
				if(is_long_method == false && pmd == false) {
					count++;
				}
			}
		}
		return count;
	}


	public int getADII(String butao) {
		int count = 0;
		if (butao.contains("buttoniPLasma3")) {
			for (int i = 1; i < LENGTH; i++) {
				boolean iPlasma = rcb.ReadCellData(i, IPLASMA);
				boolean is_long_method = rcb.ReadCellData(i, IS_LONG_METHOD);
				if(is_long_method == false && iPlasma == true) {
					count++;
				}
			}
		} else {
			for (int i = 1; i < LENGTH; i++) {
				boolean pmd = rcb.ReadCellData(i, PMD);
				boolean is_long_method = rcb.ReadCellData(i, IS_LONG_METHOD);
				if(is_long_method == false && pmd == true) {
					count++;
				}
			}
		}
		return count;
	}


	public int getIPlasma() {
		int count = 0;
		for (int i = 1; i < LENGTH; i++) {
			boolean iPlasma = rcb.ReadCellData(i, IPLASMA);

			if (iPlasma == true)
				count++;
		}
		return count;
	}


	public int getPmd() {
		int count = 0;
		for (int i = 1; i < LENGTH; i++) {
			boolean pmd = rcb.ReadCellData(i, PMD);

			if (pmd == true)
				count++;
		}
		return count;
	}


//	public static void main(String[] args)   {  
//		Conditions c = new Conditions();
//		System.out.println("aaa");
//		System.out.println(c.getIPlasma());
//		System.out.println(c.getPmd());
//		System.out.println("Oi");
//	}







}
