public class Employee {

    int empID;
    double basicsalary;
    double hra;
    double da;
    double pf;
    double tax;

    public Employee(int empID, double basicsalary, double hra, double da, double pf, double tax) {
        this.empID = empID;
        this.basicsalary = basicsalary;
        this.hra = hra;
        this.da = da;
        this.pf = pf;
        this.tax = tax;
    }

    public double grossSalary() {
        return basicsalary + hra + da;
    }

    public double netSalary() {
        return grossSalary() - pf - tax;
    }

    public void display() {
        System.out.println("Employee ID: " + empID);
        System.out.println("Basic Salary: " + basicsalary);
        System.out.println("HRA: " + hra);
        System.out.println("DA: " + da);
        System.out.println("PF: " + pf);
        System.out.println("Tax: " + tax);
        System.out.println("Gross Salary: " + grossSalary());
        System.out.println("Net Salary: " + netSalary());
    }
}
