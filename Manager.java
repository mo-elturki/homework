
package interfacehw;
    
class Manager extends Employee implements Salary {

    Manager(String name) {
        super(name);
    }

    @Override
    void work() {
        System.out.println(name + " is managing the team and planning sprints.");
    }

    @Override
    public void getSalary() {
        System.out.println("Manager " + name + " Salary = 5000");
    }
}
