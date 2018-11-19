package Pkg2_contostring;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=100;
		String s="100";
		Integer i2= Integer.valueOf(s);
		
		if(i==i2) {
			System.out.println("Matched");
		}else {
			System.out.println("Not Matching");
		}

	}

}
