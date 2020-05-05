public class EmpWagecomputations {

	public static void main(String []args){

		int IS_PRESENT = 1;
		int EMP_RATE_PER_HOUR = 20;

		int empHrs = 0;
		int empWage = 0 ;

		double empCheck = Math.floor( Math.random() * 10 ) % 2;
			if( empCheck == IS_PRESENT )
				empHrs = 8;
			else
				empHrs = 0;

			empWage = empHrs * EMP_RATE_PER_HOUR;
			System.out.println("Employee Wage:"+ empWage);
	}
}
