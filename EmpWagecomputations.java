public class EmpWagecomputations {

        private static final int IS_FULL_TIME = 1;
	private static final int IS_PART_TIME = 2;
	private static final int EMP_RATE_PER_HOUR = 20;
	private static final int EMP_WORKING_DAYS = 20;

	public static void main(String []args){

		int empHrs = 0;
		int empWage = 0 ;
		int totalEmpHrs = 0 ;
		int totalEmpWage = 0 ;

		for(int day = 0; day < EMP_WORKING_DAYS ; day++ ){
			int empCheck = (int) Math.floor( Math.random() * 10 ) % 3;

			switch( empCheck ){
		 		case IS_FULL_TIME:
					empHrs = 8;
					break;
				case IS_PART_TIME:
					empHrs = 4;
					break;
				default:
					empHrs = 0;
			}
			totalEmpHrs += empHrs ;
		}
		totalEmpWage = totalEmpHrs * EMP_RATE_PER_HOUR;
		System.out.println("Employee Wage:"+ totalEmpWage);
	}

}
