
package interfacehw;

public class InterFaceHW {

    static void showWork(Employee e) {
        e.work();
    }
    static void showSalaryDetails(Salary s) {
        s.getSalary();
    }
    public static void main(String[] args) {

        Employee m = new Manager("Ahmed");
        Employee p = new Programmer("Ali");
        Employee d = new Designer("Mamdouh");
        
        showWork(m);
        showWork(p);
        showWork(d);

        showSalaryDetails((Salary) m);
        showSalaryDetails((Salary) p);
        showSalaryDetails((Salary) d);
    }
}
 
