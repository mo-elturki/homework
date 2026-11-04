
package interfacehw;

class Programmer extends Employee implements Salary {

    Programmer(String name) {
        super(name);
    }

    @Override
    void work() {
        System.out.println(name + " is writing and debugging Java code.");
    }

    @Override
    public void getSalary() {
        System.out.println("Programmer " + name + " Salary = 4000");
    }
}
