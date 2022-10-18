public class whiteCollarWorker extends Worker{
    private double salary;
    public whiteCollarWorker(){};

    public whiteCollarWorker(String name, String last_name, int birth, int pesel, int employ_year, char gend, String company, String occupation, double salary) {
        super(name, last_name, birth, pesel, employ_year, gend, company, occupation);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "whiteCollarWorker{" +
                "salary=" + salary +
                "} " + super.toString();
    }

    public void display(){
        System.out.println(toString());
    }
}
