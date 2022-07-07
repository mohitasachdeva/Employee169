package employee;

public class PartTime {
    public static void main(String[] args) {
        int fulltime=2;
        int parttime=1;
        int emprateperhr=20;
        int empHrs=0;
        int empWage=0;
        double empcheck=Math.floor(Math.random()*10)%3;
        if(empcheck==fulltime)
            empHrs=8;
        else if (empcheck==parttime)
            empHrs=4;

        else
            empHrs=0;
        empWage=empHrs*emprateperhr;
        System.out.println("emp wage:" +empWage);
    }
    }

