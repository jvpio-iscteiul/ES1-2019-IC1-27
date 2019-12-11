import java.io.BufferedReader;
import java.io.FilterInputStream;
import java.io.IOException;

import javax.swing.JTextField;


public class Conditions {

	
	private static boolean is_long_method;
	private BufferedReader in;
	private static final int LENGTH = 30;
	private static final int PMD = 10;
	private static final int IPLASMA = 9;
	private static final int IS_LONG_METHOD = 8;
	private ReadCellInteger rci;
	private ReadCellBoolean rcb;

	
	public Conditions() {
		this.rci = new ReadCellInteger();
		this.rcb = new ReadCellBoolean();
	}


	public boolean setLongMethod(JTextField locLimit, JTextField cycloLImit) {
		String ll = locLimit.getText();
		int x = Integer.parseInt(ll);
		String cl = cycloLImit.getText();
		int y = Integer.parseInt(cl);
		if (x > 80 && y >10)
			is_long_method = true;
		else 
			is_long_method = false;
		return is_long_method;
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
//		System.out.println(c.getDCI());
		System.out.println("Oi");
	}

	
	
	
	
	
	
	
	
}