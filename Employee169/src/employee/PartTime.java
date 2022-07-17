package employee;

public class PartTime {

    public static void main(String[] args) {
        System.out.println("Welcome to Employee wage");

        int FULL_TIME=2;
        int PART_TIME=1;
        int EMP_RATE_PER_HRS=20;
        int empHrs=0;
        int empWage=0;
        double empcheck=Math.floor(Math.random()*10)%3;
        if(empcheck==FULL_TIME)
            empHrs=8;
        else if (empcheck==PART_TIME)
            empHrs=4;

        else
            empHrs=0;
        empWage=empHrs*EMP_RATE_PER_HRS;
        System.out.println("emp wage:" +empWage);
    }
    }

