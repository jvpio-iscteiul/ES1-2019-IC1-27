import java.io.FilterInputStream;

public class Conditions {

	private static boolean is_long_method;
	private static final int LOC = 4;
	private static final int CYCLO = 5;
	private ReadCellString rc;

	private Conditions() {
		this.rc = new ReadCellString();
	}


	private void firstCondition() {
		for (int i = 1; i < 422; i++) {
			String loc = rc.ReadCellData(i, LOC);
			System.out.println(loc);
		}
//		if (LOC > 80 && CYCLO >10)
//			is_long_method = true;
//		else 
//			is_long_method = false;
//		return is_long_method;
	}
	
	
	public static void main(String[] args)   {  
		Conditions c = new Conditions();
		c.firstCondition();
	}
	
}
