package employee;

public class Month {
    public static final int IS_FULL_TIME = 2;
    public static final int IS_PART_TIME = 1;
    public static final int IS_EMP_RATE_PER_HRS = 20;
    public static final int NO_OF_WORKING_DAYS = 20;
    public static void main(String[] args) {
        System.out.println("Welcome to the employee wages");
        int empHrs = 0;
        int empWage = 0;
        int totalwages=0;
        for(int day=0; day<=NO_OF_WORKING_DAYS; day++){
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

            empWage = empHrs * IS_EMP_RATE_PER_HRS;

            System.out.println("emp wage:" + empWage);
            totalwages+=empWage;
        }
        System.out.println("total wages=>" +totalwages);
        }
    }

