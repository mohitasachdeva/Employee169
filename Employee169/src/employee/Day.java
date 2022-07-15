package employee;

public class Day {
    public static final int IS_FULL_TIME = 2;
    public static final int IS_PART_TIME = 1;
    public static final int IS_EMP_RATE_PER_HRS = 20;
    public static final int NO_OF_WORKING_DAYS = 20;
    public static final int MXM_HRS_IN_MONTH = 10;
    public static int computeEmpWage() {
        int empHrs = 0;
        int totalhrs = 0;
        int totaldays = 0;
        while (totalhrs <= MXM_HRS_IN_MONTH && totaldays < NO_OF_WORKING_DAYS) {
            totaldays++;
            int empcheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empcheck) {
                case IS_PART_TIME:
                    empHrs = 4;
                    break;
                case IS_FULL_TIME:
                    empHrs = 8;
                    break;
                default:
                    empHrs = 0;
            }
            totalhrs += empHrs;
            System.out.println("Day#:" + totaldays + " emp hr:" + empHrs);
        }
        int totalempwage = empHrs * IS_EMP_RATE_PER_HRS;
        System.out.println("total emp wages:" + totalempwage);
        return totalempwage;
    }
         public static void main(String[] args){
        computeEmpWage();

    }
}

