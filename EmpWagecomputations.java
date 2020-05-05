public class EmpWagecomputations {

        private static final int IS_FULL_TIME = 1;
	private static final int IS_PART_TIME = 2;
	private static final int EMP_RATE_PER_HOUR = 20;
	private static final int MAX_WORKING_DAYS = 20;
        private static final int MAX_WORKING_HRS = 100;

	public static void main(String []args){
	        int empWorkingHrs = 0 ;
		int totalEmpWage = 0 ;
		int empWorkingDays = 0 ;


        while( empWorkingDays < MAX_WORKING_DAYS && empWorkingHrs <= MAX_WORKING_HRS ){

			empWorkingDays++;
			int empHrs = 0;
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
			empWorkingHrs += empHrs ;
		}
		totalEmpWage = empWorkingHrs * EMP_RATE_PER_HOUR;
		System.out.println("Employee Wage:"+ totalEmpWage);
	}

}
