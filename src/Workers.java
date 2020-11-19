public class Workers extends Human {
    private double wExperience = 0.1;
    private int salary;

    public Workers(String firstName, String lastName, int year, char gender, double wExperience, int salary) {
        super(firstName, lastName, year, gender);
        setwExperience(wExperience);
        setSalary(salary);
    }

    public double getwExperience() {

        return wExperience;
    }

    public void setwExperience(double wExperience) {
        if (wExperience > 0.0 && wExperience < 60.0) {
            this.wExperience = wExperience;
        } else
            System.out.println("You can't work for us!");
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        if (salary > 0) {
            this.salary = salary;
        } else System.out.println("Too little salary((");
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Experience: " + getwExperience() + " years");
        System.out.println("Salary: " + getSalary() + "$");

    }


}
