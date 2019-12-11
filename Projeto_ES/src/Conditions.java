import java.io.BufferedReader;
import java.io.FilterInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
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
	}


	public List<String> setLongMethod(JTextField locLimit, JTextField cycloLImit) {
		String ll = locLimit.getText();
		int x = Integer.parseInt(ll);
		String cl = cycloLImit.getText();
		int y = Integer.parseInt(cl);
		for (int i = 1; i < LENGTH; i++) {
			int lim1 = rci.ReadCellData(i, LOC);
			int lim2 = rci.ReadCellData(i, CYCLO);
			if (lim1 > x && lim2 > y) 
				System.out.println(rcs.ReadCellData(i, METHOD));
				lista1.add(rcs.ReadCellData(i, METHOD));
		}
		return lista1;
	}


	public List<String> setFeatureEnvy(JTextField locLimit, JTextField cycloLImit) {
		String ll = locLimit.getText();
		int x = Integer.parseInt(ll);
		String cl = cycloLImit.getText();
		int y = Integer.parseInt(cl);
		for (int i = 1; i < LENGTH; i++) {
			int lim1 = rci.ReadCellData(i, ATFD);
			int lim2 = rci.ReadCellData(i, LAA);
			if (lim1 > x && lim2 < y) 
				lista2.add(rcs.ReadCellData(i, METHOD));
		}

		return lista2;
	}

	public void aol() {
		System.out.println("s");
	}


	public int getDCI(JTextField tx1) {
		int count = 0;
		for (int i = 1; i < LENGTH; i++) {
			boolean pmd = rcb.ReadCellData(i, PMD);
			boolean iPlasma = rcb.ReadCellData(i, IPLASMA);
			boolean is_long_method = rcb.ReadCellData(i, IS_LONG_METHOD);
			if(is_long_method == true && (iPlasma || pmd) == true) {
				count++;
			}
		}
		return count;
	}

	
	public int getDII() {
		int count = 0;
		for (int i = 1; i < LENGTH; i++) {
			boolean pmd = rcb.ReadCellData(i, PMD);
			boolean iPlasma = rcb.ReadCellData(i, IPLASMA);
			boolean is_long_method = rcb.ReadCellData(i, IS_LONG_METHOD);
			if(is_long_method == true && (iPlasma || pmd) == false) {
				count++;
			}
		}
		return count;
	}

	
	public int getADCI() {
		int count = 0;
		for (int i = 1; i < LENGTH; i++) {
			boolean pmd = rcb.ReadCellData(i, PMD);
			boolean iPlasma = rcb.ReadCellData(i, IPLASMA);
			boolean is_long_method = rcb.ReadCellData(i, IS_LONG_METHOD);
			if(is_long_method == false && (iPlasma || pmd) == false) {
				count++;
			}
		}
		return count;
	}

	public int getADII() {
		int count = 0;
		for (int i = 1; i < LENGTH; i++) {
			boolean pmd = rcb.ReadCellData(i, PMD);
			boolean iPlasma = rcb.ReadCellData(i, IPLASMA);
			boolean is_long_method = rcb.ReadCellData(i, IS_LONG_METHOD);
			if(is_long_method == false && (iPlasma || pmd) == true) {
				count++;
			}
		}
		return count;
	}


	public static void main(String[] args)   {  
		Conditions c = new Conditions();
		System.out.println("aaa");
		System.out.println("");
		System.out.println("Oi");
	}


}
