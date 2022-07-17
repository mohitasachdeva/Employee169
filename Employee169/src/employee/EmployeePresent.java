package employee;

public class EmployeePresent {
    public static void main(String[] args) {
        int a=1;
        double empCheck=Math.floor(Math.random()*10%2);
        if (empCheck==a)
            System.out.println("employee is present");
        else
            System.out.println("employee is absent");
    }
}
