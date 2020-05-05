public class EmpWagecomputations {

	public static void main(String []args){

		int IS_PRESENT = 1;
		double empCheck = Math.floor( Math.random() * 10 ) % 2;
			if( empCheck == IS_PRESENT )
				System.out.println("Employee is present");
			else
				System.out.println("Employee is Absent");
	}
}
