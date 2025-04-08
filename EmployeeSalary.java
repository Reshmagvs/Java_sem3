import java.util.Scanner;

public class EmployeeSalary { 

    String name, empNo;
    int basic;
    double da, hra, pf, grossSalary, netSalary; 

    public EmployeeSalary(String name, String empNo, int basic) { 
        this.name = name;
        this.empNo = empNo;
        this.basic = basic;
    }

    public void compute() {
        da = basic * 0.3; 
        hra = basic * 0.15;
        pf = basic * 0.12;
        grossSalary = basic + da + hra;
        netSalary = grossSalary - pf;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Employee Number: " + empNo);
        System.out.printf("Gross Salary: Rs. %.2f\n", grossSalary); 
        System.out.printf("Net Salary: Rs. %.2f\n", netSalary);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name, empNo;
        int basicSalary;

        System.out.println("Enter Employee's Name, Employee No, Basic salary:");
        name = in.nextLine();
        empNo = in.nextLine(); 
        basicSalary = in.nextInt();

        EmployeeSalary employee = new EmployeeSalary(name, empNo, basicSalary);
        employee.compute();
        employee.display();

        in.close(); 
    }
}
