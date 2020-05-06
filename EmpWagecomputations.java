public class EmpWagecomputations {

        private static final int IS_FULL_TIME = 1;
	private static final int IS_PART_TIME = 2;
        public static final int MAX_NUMBER_OF_COMPANIES=3;

	public int empHrs = 0;
	private int numOfCompany = 0;
	private CompanyEmpWage[] companyEmpWageArray;

	public EmpWagecomputations () {
		companyEmpWageArray = new CompanyEmpWage[MAX_NUMBER_OF_COMPANIES];
	}

	private void addCompanyEmpWage (String company, int empRatePerHr, int maxWorkingDays, int maxWorkingHrsPerMonth) {
		companyEmpWageArray[numOfCompany] = new CompanyEmpWage(company, empRatePerHr, maxWorkingDays, maxWorkingHrsPerMonth);
		numOfCompany++;
	}

	private	void computeEmpWageForCompany () {
		for(int company = 0; company< numOfCompany; company++ ) {
			int totalEmpWage = this.computeEmpWageForCompany(companyEmpWageArray[company]);
                }
	}

        public  int computeEmpWageForCompany (CompanyEmpWage companyEmpWage) {
		int totalEmpHrs = 0, day = 1;
                while (day <= companyEmpWage.maxWorkingDays && totalEmpHrs < companyEmpWage.maxWorkingHrsPerMonth) {
                        getWorkingHrs();
                        totalEmpHrs += empHrs;
                        day++;
                }
           		int totalEmpWage = totalEmpHrs * companyEmpWage.empRatePerHr;
			System.out.println(companyEmpWage.company +" Employee wage for a month is " + totalEmpWage);
		return totalEmpWage;
	}

        public void getWorkingHrs () {
		int empCheck = (int) Math.floor(Math.random() * 10) % 3;
                switch (empCheck) {
                case IS_FULL_TIME:
                        empHrs = 8;
                        break;
                case IS_PART_TIME:
                        empHrs = 4;
                        break;
                default :
                        empHrs = 0;
                        break;
                }
	}

	public static void main (String[] args) {
		EmpWagecomputations e1 = new  EmpWagecomputations ();
		e1.addCompanyEmpWage("DMart",20,10,50);
                e1.addCompanyEmpWage("Reliance",30,15,70);
		e1.addCompanyEmpWage("Vishal Mega Mart",40,20,90);
		e1.computeEmpWageForCompany();
	}
}
