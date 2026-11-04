
package interfacehw;

class Designer extends Employee implements Salary {

    Designer(String name) {
        super(name);
    }

    @Override
    void work() {
        System.out.println(name + " is designing UI/UX layouts.");
    }

    @Override
    public void getSalary() {
        System.out.println("Designer " + name + " Salary = 3500");
    }
}
