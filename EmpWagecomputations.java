public class EmpWagecomputations {

        private static final int IS_FULL_TIME = 1;
	private static final int IS_PART_TIME = 2;

       public static void calcEmpWageForCompany(String company,int empRate,int numOfDays,int maxHrs){
		int empWorkingHrs = 0 ;
		int totalEmpWage = 0 ;
		int empWorkingDays = 0 ;

		while( empWorkingDays < numOfDays && empWorkingHrs <= maxHrs ){

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
		totalEmpWage = empWorkingHrs * empRate;
		System.out.println(company+" Employee Wage is :"+ totalEmpWage);
	}

	public static void main(String []args){
		System.out.println("Welcome to Employee Wage Computation");
		calcEmpWageForCompany("DMart",20,2,10);
		calcEmpWageForCompany("Reliance",10,4,20);
	}

}
